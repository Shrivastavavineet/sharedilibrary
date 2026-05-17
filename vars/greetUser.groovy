def call(String name) {
    // 1. Current Date aur Time nikalna
    def now = new Date()
    def date = now.format("yyyy-MM-dd")
    def time = now.format("HH:mm:ss")

    echo "Hello ${name}, welcome to the pipeline!"

    // 2. Resource folder se index.html read karna
    // Note: libraryResource hamesha 'resources/' folder mein dekhta hai
    def template = libraryResource 'index.html'

    // 3. Placeholders ko actual values se replace karna
    template = template
                .replace('${name}', name)
                .replace('${date}', date)
                .replace('${time}', time)

    // 4. Updated HTML ko workspace mein write karna (Optional but useful)
    writeFile file: 'index.html', text: template
    
    echo "Successfully updated index.html with name: ${name} at ${date} ${time}"
}
