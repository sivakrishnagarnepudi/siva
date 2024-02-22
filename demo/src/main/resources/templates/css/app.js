// Access webcam feed and display in video element
const video = document.getElementById('video-feed');

if (navigator.mediaDevices && navigator.mediaDevices.getUserMedia) {
    navigator.mediaDevices.getUserMedia({ video: true })
        .then(function (stream) {
            video.srcObject = stream;
        })
        .catch(function (error) {
            console.error('Error accessing webcam:', error);
        });
} else {
    console.error('getUserMedia is not supported by this browser');
}


const captureBtn = document.getElementById('capture-btn');
captureBtn.addEventListener('click', function () {
    captureImage();
});

function captureImage() {

    const canvas = document.createElement('canvas');
    const context = canvas.getContext('2d');
    canvas.width = video.videoWidth;
    canvas.height = video.videoHeight;
    context.drawImage(video, 0, 0, canvas.width, canvas.height);


    const imageData = canvas.toDataURL('image/png');

    /
    sendToBackendForProcessing(imageData);
}

function sendToBackendForProcessing(imageData) {

}
