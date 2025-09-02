```markdown
# Web Services Course Project - English to Moroccan Arabic (Darija) Translator

## Project Overview
This project implements a **RESTful web service powered by an LLM** (Large Language Model) for translating English text into Moroccan Arabic Dialect (Darija). The web service is named **TranslatorResource** and provides a main method:

- `translate(String text)`: Takes an English text as input and returns its translation in Darija.

The translation functionality can be implemented using LLMs such as [Google Gemini](https://ai.google.dev/pricing#1_5flash) or other free alternatives.

Additionally, this project includes a **mobile application** that consumes the RESTful web service to provide translations on mobile devices.

---

## Project Structure

```

.mvn/wrapper/         # Maven wrapper files
src/main/             # Java source code for the web service
.classpath            # Eclipse project file
.gitignore            # Git ignore file
.project              # Eclipse project file
README.md             # Project documentation
mvnw                  # Maven wrapper script
mvnw\.cmd              # Windows Maven wrapper script
pom.xml               # Maven project configuration



## Web Service Implementation

- **Technology:** Java, JAX-RS (for REST API)
- **Business Class:** `TranslatorResource`
- **Main Method:** `translate(String text)`

### Testing

You can test the web service using:

- **SoapUI**: Create a REST request and send sample English text.
- **cURL**: Example command:

```bash
curl -X POST http://localhost:8080/translator/translate \
     -H "Content-Type: application/json" \
     -d '{"text": "Hello, how are you?"}'
````

---

## Mobile Application

The mobile app connects to the RESTful service and allows users to:

* Input English text
* Receive translations in Darija
* Display translations in a simple user interface

---

## How to Run

1. Clone the repository:

```bash
git clone <your-repository-url>
```

2. Build the project with Maven:

```bash
./mvnw clean install
```

3. Run the web service:

```bash
./mvnw spring-boot:run
```

4. Open the mobile application project in your preferred IDE (e.g., Android Studio) and run it on an emulator or device.

---

## References

* [Google Gemini](https://ai.google.dev/pricing#1_5flash)
* [JAX-RS API](https://jax-rs.github.io/)
* [SoapUI](https://www.soapui.org/)

```
