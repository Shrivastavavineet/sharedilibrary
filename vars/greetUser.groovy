// Purana code shayad sirf 'def call()' tha, use aise karein:
def call(String name) {
    echo "Hello ${name}, welcome to the pipeline!"
    // Agar aap resource file read kar rahe hain toh:
    def fileContent = libraryResource 'index.html'
    echo "Resource Content: ${fileContent}"
}
