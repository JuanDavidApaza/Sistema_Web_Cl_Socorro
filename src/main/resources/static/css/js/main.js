document.addEventListener("DOMContentLoaded", () => {

    // ==========================================
    // 1. Botón Flotante (Scroll Top)
    // ==========================================
    const btnScrollTop = document.getElementById("btnScrollTop");

    // Verificamos que el botón exista en la página actual
    if (btnScrollTop) {
        // Mostrar u ocultar el botón dependiendo de cuánto se ha bajado
        window.addEventListener("scroll", () => {
            if (window.scrollY > 300) {
                btnScrollTop.classList.add("show");
            } else {
                btnScrollTop.classList.remove("show");
            }
        });

        // Al hacer clic, sube suavemente al inicio
        btnScrollTop.addEventListener("click", () => {
            window.scrollTo({
                top: 0,
                behavior: "smooth"
            });
        });
    }

});