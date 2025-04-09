require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

      state: Start
    q!: $regex</start>
    a: ¡Hola! ¿En qué puedo ayudarte hoy sobre VoIP, PBX o Call Centers?
    event: noMatch || toState = "./"

  state: VoIP_Info
    intent!: /voip_info
    a: VoIP (Voz sobre Protocolo de Internet) es una tecnología que permite realizar llamadas de voz a través de internet en lugar de las líneas telefónicas tradicionales. ¿Tienes alguna pregunta específica sobre VoIP?

  state: PBX_Info
    intent!: /pbx_info
    a: PBX (Private Branch Exchange) es un sistema telefónico privado utilizado dentro de una empresa u organización. Permite gestionar las llamadas internas y externas, así como ofrecer funcionalidades como extensiones, transferencias y correo de voz. ¿Qué te gustaría saber sobre los sistemas PBX?

  state: CallCenter_Info
    intent!: /callcenter_info
    a: Un Call Center es un centro de atención telefónica utilizado por las empresas para gestionar un gran volumen de llamadas de clientes, ya sea para soporte, ventas o información. ¿Hay algo en particular sobre Call Centers en lo que te pueda ayudar?

  state: VoIP_Questions
    intent!: /voip_questions
    q!: ¿Qué es VoIP? | ¿Cómo funciona VoIP? | ¿Cuáles son las ventajas de VoIP? | ¿Qué necesito para VoIP?
    a: VoIP convierte tu voz en datos digitales que se transmiten a través de internet. Ofrece ventajas como costos más bajos, flexibilidad y funciones avanzadas. ¿Tienes alguna otra duda?

  state: PBX_Questions
    intent!: /pbx_questions
    q!: ¿Qué es un PBX? | ¿Cómo funciona un PBX? | ¿Cuáles son los tipos de PBX? | ¿Qué beneficios tiene un PBX?
    a: Un PBX gestiona las comunicaciones telefónicas de una organización. Existen PBX tradicionales y PBX IP (basados en internet). Ofrecen control y funcionalidades para la gestión de llamadas. ¿Te interesa algún aspecto en particular?

  state: CallCenter_Questions
    intent!: /callcenter_questions
    q!: ¿Qué es un Call Center? | ¿Cuáles son los tipos de Call Centers? | ¿Qué tecnologías se usan en un Call Center? | ¿Cómo mejorar un Call Center?
    a: Los Call Centers pueden ser inbound (reciben llamadas) o outbound (realizan llamadas). Utilizan tecnologías como IVR y CRM para gestionar las interacciones con los clientes. ¿Qué te gustaría optimizar de un Call Center?

  state: NoMatch
    event!: noMatch
    a: No entiendo tu pregunta relacionada con VoIP, PBX o Call Centers. ¿Podrías reformularla? Tu dijiste: {{$request.query}}

  state: Match
    event!: match
    a: {{$context.intent.answer}}
