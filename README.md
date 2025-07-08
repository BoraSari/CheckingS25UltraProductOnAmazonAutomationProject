Checking S25 Ultra Product On Amazon Automation Project
Project Overview
This project provides an automated test suite for verifying a specific product search and detail page flow on the Amazon e-commerce website. It focuses on searching for a particular product (e.g., "S25 Ultra"), handling scenarios where the product might not be found, and validating the error management process. Developed using Java, Selenium WebDriver, and TestNG, it adheres to the Page Object Model (POM) for structured and maintainable test code.

Project Goal
The main objectives of this project are to:

Automate the search for a specific product on Amazon.

Navigate to the product's detail page if found.

Verify proper error handling and messaging when the searched product is not available or found.

Showcase practical application of Java, Selenium WebDriver, and TestNG for e-commerce test automation, emphasizing search functionality and error validation.

Technologies Used
Programming Language: Java

Test Automation Framework: Selenium WebDriver

Testing Framework: TestNG

Design Pattern: Page Object Model (POM)

Setup and Run Instructions
To set up and run this project locally, follow these steps:

Clone the Repository:

git clone https://github.com/BoraSari/CheckingS25UltraProductOnAmazonAutomationProject.git
cd CheckingS25UltraProductOnAmazonAutomationProject

(Note: Replace BoraSari with your actual GitHub username if different. Adjust the repository name if it's different in your actual GitHub setup.)

Prerequisites:

Ensure Java Development Kit (JDK) 8 or higher is installed.

Have Maven (or Gradle) installed and configured for dependency management.

Download the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) for your browser and ensure it's accessible by your test environment (e.g., via WebDriverManager or system PATH).

Ensure BaseTest class correctly initializes the WebDriver.

Build the Project:

mvn clean install

(If using Gradle, replace mvn commands with gradle commands.)

Run the Tests:
Tests are configured with TestNG. You can run them via a TestNG XML suite or directly from your IDE (e.g., IntelliJ IDEA, Eclipse).

Example testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Amazon S25 Ultra Product Check Suite">
    <test name="Product Check Tests">
        <classes>
            <class name="YourTestPackage.YourTestClass"/> <!-- Replace with your actual test class -->
        </classes>
    </test>
</suite>

Run with Maven:

mvn test -DsuiteXmlFile=testng.xml

Or run directly from your IDE.

Test Coverage and Scenarios
This project covers the following key scenarios for Amazon product search and error handling:

Product Search and Error Handling:

Description: Automates the process of searching for a specific product (e.g., "S25 Ultra") on the Amazon website. It then verifies the appropriate behavior, whether the product is found or not, including the display of "product not found" messages or navigating to the product detail page.

Flow: Navigates to the Amazon homepage, enters the product name into the search bar, performs the search, and asserts the expected outcome (e.g., product details displayed or an error message indicating the product is not found).

Screenshots/GIFs
(Please add screenshots or GIFs here demonstrating the test execution for various scenarios, such as the search results page, and any error messages displayed when the product is not found, to visually showcase the project's functionality.)

License
This project is licensed under the MIT License - see the LICENSE file for details.

Amazon S25 Ultra Ürün Kontrol Otomasyon Projesi
Projeye Genel Bakış
Bu proje, Amazon e-ticaret web sitesinde belirli bir ürün arama ve detay sayfası akışını doğrulamak için otomatik bir test paketi sunar. Belirli bir ürünü (örn: "S25 Ultra") aramaya, ürünün bulunamadığı senaryoları ele almaya ve hata yönetimi sürecini doğrulamaya odaklanır. Java, Selenium WebDriver ve TestNG kullanılarak geliştirilen bu proje, yapılandırılmış ve bakımı kolay test kodu için Page Object Model (POM) prensiplerine uyar.

Proje Amacı
Bu projenin temel hedefleri şunlardır:

Amazon'da belirli bir ürün aramasını otomatikleştirmek.

Bulunursa ürünün detay sayfasına gitmek.

Aranan ürün mevcut olmadığında veya bulunamadığında uygun hata yönetimi ve mesajlaşmayı doğrulamak.

Arama işlevselliği ve hata doğrulamasına vurgu yaparak e-ticaret test otomasyonu için Java, Selenium WebDriver ve TestNG'nin pratik uygulamasını sergilemek.

Kullanılan Teknolojiler
Programlama Dili: Java

Test Otomasyon Çerçevesi: Selenium WebDriver

Test Çerçevesi: TestNG

Tasarım Deseni: Page Object Model (POM)

Kurulum ve Çalıştırma Talimatları
Bu projeyi yerel olarak kurmak ve çalıştırmak için aşağıdaki adımları izleyin:

Depoyu Klonlayın:

git clone https://github.com/BoraSari/CheckingS25UltraProductOnAmazonAutomationProject.git
cd CheckingS25UltraProductOnAmazonAutomationProject

(Not: BoraSari yerine gerçek GitHub kullanıcı adınızı yazın. GitHub'daki gerçek kurulumunuz farklıysa depo adını ayarlayın.)

Ön Koşullar:

Java Development Kit (JDK) 8 veya daha yüksek bir sürümün yüklü olduğundan emin olun.

Maven (veya Gradle) yüklü ve bağımlılık yönetimi için yapılandırılmış olmalıdır.

Tarayıcınız için uygun WebDriver'ı (örn: ChromeDriver, GeckoDriver) indirin ve test ortamınız tarafından erişilebilir olduğundan emin olun (örn: WebDriverManager veya sistem PATH aracılığıyla).

BaseTest sınıfının WebDriver'ı doğru bir şekilde başlattığından emin olun.

Projeyi Derleyin:

mvn clean install

(Gradle kullanıyorsanız, mvn komutlarını gradle komutlarıyla değiştirin.)

Testleri Çalıştırın:
Testler TestNG ile yapılandırılmıştır. Testleri bir TestNG XML paketi aracılığıyla veya doğrudan IDE'nizden (örn: IntelliJ IDEA, Eclipse) çalıştırabilirsiniz.

Örnek testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Amazon S25 Ultra Ürün Kontrol Paketi">
    <test name="Ürün Kontrol Testleri">
        <classes>
            <class name="YourTestPackage.YourTestClass"/> <!-- Lütfen gerçek test sınıfınızla değiştirin -->
        </classes>
    </test>
</suite>

Maven ile çalıştırma:
mvn test -DsuiteXmlFile=testng.xml

Veya doğrudan IDE'nizden çalıştırın.

Test Kapsamı ve Senaryoları
Bu proje, Amazon ürün araması ve hata yönetimi için aşağıdaki temel senaryoları kapsar:

Ürün Arama ve Hata Yönetimi:

Açıklama: Amazon web sitesinde belirli bir ürün (örn: "S25 Ultra") arama sürecini otomatize eder. Ardından, ürünün bulunup bulunmamasına bakılmaksızın (örn: "ürün bulunamadı" mesajlarının görüntülenmesi veya ürün detay sayfasına gitme) uygun davranışı doğrular.

Akış: Amazon ana sayfasına gider, ürün adını arama çubuğuna girer, aramayı gerçekleştirir ve beklenen sonucu (örn: ürün detayları görüntülenir veya ürünün bulunamadığını belirten bir hata mesajı) doğrular.

Ekran Görüntüleri/GIF'ler
![image](https://github.com/user-attachments/assets/49df6b99-5f41-4277-bfd3-4d6d5d5b87b2)


Lisans
Bu proje MIT Lisansı altında lisanslanmıştır - daha fazla ayrıntı için LICENSE dosyasına bakın.
