    class Notifier {
        private List<String> messages = []

        def notify(String message) {
            messages.add(message)
        }

        def getMessages() {
            return messages
        }
    }


