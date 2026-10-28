# Antonyhern16 CODM Training — replacement Android project

This is a clean replacement project because only the compiled APK was provided; its original source project was not available. It does not patch or preserve unverified features from the original APK.

## Included
- Persistent ON/OFF switches for recoil training, sensitivity assistant, aim-training coach, aim-assist settings guide, and performance tracker.
- Master switch.
- Local practice result logging and accuracy calculation.
- Android native UI; no network permission or game integration.

## Important limits
This is a training companion only. It does not create an aimbot, alter CODM recoil, automate aiming, modify game memory, or guarantee 100% accuracy. Switches enable/disable features within this app.

## Build APK from a phone using GitHub
1. Create a GitHub repository and upload the contents of this folder (not the folder itself).
2. Open the repository's **Actions** tab.
3. Select **Build Android APK** and tap **Run workflow** (or push to `main`).
4. When the workflow finishes, open the run and download the `Antonyhern16-CODM-Training-APK` artifact.
5. Extract the downloaded artifact ZIP on your phone and install `app-debug.apk`. Android may ask you to allow installs from your browser/files app.

The workflow builds a debug-signed APK suitable for testing. For public distribution, create a release build signed with your own private signing key.

## Package identity
Application ID: `com.antonyhern16.codmtrainer`. This is a new app and will install separately from the original unless its package name/signing identity match, which cannot be confirmed from the supplied APK alone.
