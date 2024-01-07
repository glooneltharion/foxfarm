const foxes = ["fox1", "fox2", "fox3"];

const header = document.querySelector("header");

foxes.forEach((f) => {
    const container = document.createElement("div");
    container.classList.add("img-container");

    const gradientBorder = document.createElement("div");
    gradientBorder.classList.add("border-gradient");

    const img = document.createElement("img");
    img.src = f + ".png";

    const audio = document.createElement("audio");
    audio.src = f + ".mp3";

    container.appendChild(gradientBorder);
    container.appendChild(img);
    container.appendChild(audio);

    img.addEventListener("click", () => {
        audio.play();
    });

    header.appendChild(container);
});