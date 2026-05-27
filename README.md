# 🛡️ Kavach (कवच) - Women & Personal Safety App

[![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)](https://developer.android.com/studio)
[![Language](https://img.shields.io/badge/Language-Kotlin%20%2F%20Java-blue?style=for-the-badge)](https://developer.android.com/guide)
[![Platform](https://img.shields.io/badge/Platform-Android-green?style=for-the-badge&logo=android)](https://www.android.com/)

**Kavach** (meaning *Shield* or *Armor*) is a robust Android-based personal safety application designed to provide immediate assistance to individuals in unsafe or critical situations. With a single press of a button, the app immediately dispatches distress signals containing real-time location tracking data to pre-selected emergency contacts and public safety numbers.

---

## ✨ Key Features

*   **One-Tap SOS Activation:** A prominent, easily accessible distress button that triggers instant alerts.
*   **Dual-Channel Distress Signals:** Automatically dispatches alerts via both **SMS** (for offline situations) and **Email** (for digital logging).
*   **Real-Time Geolocation:** Captures the exact coordinates of the user and attaches an instant Google Maps navigation link (`https://maps.google.com/?q=latitude,longitude`) to the distress message.
*   **Native Device Integration:** Allows users to effortlessly import and manage trusted emergency contacts directly from their phone's native address book.
*   **Offline Fallback Architecture:** Prioritizes localized cellular SMS protocols, ensuring messages successfully send even when mobile data or Wi-Fi is completely unavailable.

---

## 🛠️ Tech Stack & Libraries

*   **Development Environment:** Android Studio
*   **Languages:** Java
*   **Database (Local Storage):** Room DB / SharedPreferences (To store emergency contacts and numbers securely on-device)
*   **Location Architecture:** Google Fused Location Provider API (Ensures fast, battery-efficient, high-accuracy GPS tracking)
*   **Communication Layer:** Android Native `SmsManager` & Background Email API Client

---

1.  **Configuration:** The user opens the app, grants permissions, and selects trusted contacts or public safety numbers using the contact picker.
2.  **Activation:** When facing danger, the user taps the central **SOS** button.
3.  **Execution:** The app instantly fetches the precise device location, formats it into a tap-to-navigate Google Maps hyperlink, and sends out background SMS and Email alerts to all designated targets without needing further interaction.

---

## 🔒 Permissions Utilized

To guarantee reliable operation during an active crisis, Kavach requests the following Android permissions:

*   `ACCESS_FINE_LOCATION` & `ACCESS_COARSE_LOCATION`: To capture precise coordinate data for emergency responders.
*   `SEND_SMS`: To push background text alerts instantly without forcing the user to manually click "Send" in their messaging app.
*   `READ_CONTACTS`: To open the device's native directory, making contact configuration seamless.

---

## 🚀 Installation & Local Setup

### Prerequisites
*   Android Studio Jellyfish (or newer)
*   An Android device or emulator running API Level 26 (Android 8.0) or higher
*   A physical device with an active SIM card is highly recommended to properly test the SMS dispatch functionality.

### Steps to Run
1.  Clone this repository to your local machine:
```bash
    git clone [https://github.com/YOUR_GITHUB_USERNAME/kavach.git](https://github.com/YOUR_GITHUB_USERNAME/kavach.git)
```
2.  Open **Android Studio** and select **Open an Existing Project**, then choose the cloned `kavach` folder.
3.  Allow Gradle to sync and download all necessary structural dependencies.
4.  Enable **Developer Options** and **USB Debugging** on your target Android device.
5.  Connect your device via USB and click the **Run** button (`Shift + F10`) to build and deploy the application.

---

## 💡 Future Enhancements Roadmap

*   [ ] **Hardware Power Button Trigger:** Allow users to activate the SOS signal by tapping the physical power button 3–4 times quickly without needing to unlock the phone screen.
*   [ ] **Continuous Location Updates:** Automatically push updated location coordinates every 2 to 3 minutes until a secure, user-defined security PIN is entered to deactivate the alert.
*   [ ] **Silent Audio Recording:** Capture a 30-second audio stream during an active emergency event and upload it immediately to secure cloud hosting for evidence logging.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for comprehensive details.
