Feature: Test 1 - Prueba funcional E2E de un flujo de compra en opencart
  Scenario: Usuario agrega dos productos al carrito y realiza un Guest checkout
    Given Usuario navega al sitio web de opencart
    When Usuario agrega dos objetos al carrito de compras
    And Usuario visaliza el carrito
    And Usuario completa un checkout como invitado
    Then Usuario observa el mensaje de confirmacion de la compra