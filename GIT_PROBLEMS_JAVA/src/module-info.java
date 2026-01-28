module com.example.javaHandsOn {
    // 'java.base' is implicitly required, so it doesn't need to be declared.
    requires java.logging; // Explicitly requires the java.logging module
    requires java.base;
    
    exports javaHandsOn; // Exporting the package named 'package2' for use by other modules
}
