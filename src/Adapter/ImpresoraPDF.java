package Adapter;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class ImpresoraPDF {
    void imprimirPDF (String pdf) {
        System.out.println(pdf);
    }
}
