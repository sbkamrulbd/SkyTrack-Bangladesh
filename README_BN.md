# SkyTrack Bangladesh — No Ads

এটি একটি স্বতন্ত্র Android starter project; Flightradar24-এর কোড/লোগো কপি করা হয়নি। এতে কোনো বিজ্ঞাপন SDK নেই। ম্যাপ ঢাকা হযরত শাহজালাল আন্তর্জাতিক বিমানবন্দরকে কেন্দ্র করে খোলে।

## শুধু Android মোবাইল দিয়ে APK বানানো (GitHub Actions)
1. ZIP ফাইলটি ফোনে ডাউনলোড করে Extract করুন। এমন ফাইল ম্যানেজার ব্যবহার করুন যাতে ZIP extract করা যায়।
2. Chrome-এ github.com খুলে অ্যাকাউন্টে sign in / account তৈরি করুন।
3. New repository তৈরি করুন, নাম দিন `skytrack-bangladesh`, Public বা Private যেকোনোটি।
4. Extract করা প্রজেক্টের সব ফাইল GitHub repository-তে upload করুন। **`.github/workflows/build-apk.yml` ফাইলটি সহ সব ফাইল upload করতে হবে**; GitHub web upload-এ hidden `.github` ফোল্ডার দেখাতে সমস্যা হলে GitHub mobile web-এ desktop site চালু করুন অথবা প্রথমে repository-তে `.github/workflows/build-apk.yml` আলাদাভাবে তৈরি করুন।
5. ফাইলগুলো `main` branch-এ commit করুন।
6. Repository → Actions → `Build SkyTrack APK` → `Run workflow` চাপুন। প্রথমবার workflow enable/approve করতে বললে সেটি করুন।
7. Build সফল হলে Actions-এ সফল run খুলুন। নিচে **Artifacts** থেকে `SkyTrack-Bangladesh-NoAds-APK` ডাউনলোড করুন।
8. ZIP artifact extract করুন। `app-debug.apk`-ই APK। সেটি খুলে Android-এর নির্দেশ অনুসারে install permission দিন।

## সীমাবদ্ধতা
- এটি unsigned debug APK; নিজের ডিভাইসে পরীক্ষার জন্য। Play Store release-এর জন্য signed release build দরকার।
- OpenSky public API-এর coverage/rate limit আছে; বাংলাদেশে সব বিমান নাও দেখা যেতে পারে। Production ব্যবহারের আগে API terms ও লাইসেন্স যাচাই করুন।
- ম্যাপ/Leaflet অনলাইনে লোড হয়, তাই ইন্টারনেট লাগে। বিজ্ঞাপন SDK অন্তর্ভুক্ত নয়, তবে বাহ্যিক ম্যাপ/API-র কনটেন্ট ও ডেটা সার্ভিসের availability নিয়ন্ত্রণ করা হয় না।
