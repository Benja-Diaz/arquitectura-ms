exports.handler = async (event) => {
    console.log("=== Iniciando Ejecución Serverless ===");
    
    // Verificamos si vienen registros desde la cola de mensajería
    if (!event.Records || event.Records.length === 0) {
        return {
            statusCode: 400,
            body: JSON.stringify({ mensaje: "No se recibieron mensajes de la cola" })
        };
    }

    // Procesamos los mensajes de extremo a extremo
    for (const record of event.Records) {
        const bodyMensaje = JSON.parse(record.body);
        console.log(`[Consumidor] Procesando mensaje ID: ${record.messageId}`);
        console.log(`[Datos Recibidos]:`, bodyMensaje);
        
        // Aquí se ejecuta la lógica de negocio en la nube sin usar servidores ya establecidos
        console.log(`[Éxito] Pedido N° ${bodyMensaje.id_pedido || 'N/A'} procesado correctamente.`);
    }

    return {
        statusCode: 200,
        body: JSON.stringify({
            mensaje: "Mensajes de la cola procesados con éxito por la FaaS",
            total_procesados: event.Records.length
        })
    };
};