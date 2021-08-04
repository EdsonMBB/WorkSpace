package com.bahena.platzimarket.persistence.mapper;

import com.bahena.platzimarket.domain.dto.PurchaseItem;
import com.bahena.platzimarket.persistence.entity.CompraProducto;
import com.bahena.platzimarket.persistence.entity.ComprasProductoPK;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-27T09:25:49-0500",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.1.jar, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class PurchaseItemMapperImpl implements PurchaseItemMapper {

    @Override
    public PurchaseItem toPurchaseItem(CompraProducto producto) {
        if ( producto == null ) {
            return null;
        }

        PurchaseItem purchaseItem = new PurchaseItem();

        Integer idProducto = productoIdIdProducto( producto );
        if ( idProducto != null ) {
            purchaseItem.setProductId( idProducto );
        }
        if ( producto.getCantidad() != null ) {
            purchaseItem.setQuantity( producto.getCantidad() );
        }
        if ( producto.getEstado() != null ) {
            purchaseItem.setActive( producto.getEstado() );
        }
        if ( producto.getTotal() != null ) {
            purchaseItem.setTotal( producto.getTotal() );
        }

        return purchaseItem;
    }

    @Override
    public CompraProducto toComprasProducto(PurchaseItem item) {
        if ( item == null ) {
            return null;
        }

        CompraProducto compraProducto = new CompraProducto();

        compraProducto.setId( purchaseItemToComprasProductoPK( item ) );
        compraProducto.setCantidad( item.getQuantity() );
        compraProducto.setEstado( item.isActive() );
        compraProducto.setTotal( item.getTotal() );

        return compraProducto;
    }

    private Integer productoIdIdProducto(CompraProducto compraProducto) {
        if ( compraProducto == null ) {
            return null;
        }
        ComprasProductoPK id = compraProducto.getId();
        if ( id == null ) {
            return null;
        }
        Integer idProducto = id.getIdProducto();
        if ( idProducto == null ) {
            return null;
        }
        return idProducto;
    }

    protected ComprasProductoPK purchaseItemToComprasProductoPK(PurchaseItem purchaseItem) {
        if ( purchaseItem == null ) {
            return null;
        }

        ComprasProductoPK comprasProductoPK = new ComprasProductoPK();

        comprasProductoPK.setIdProducto( purchaseItem.getProductId() );

        return comprasProductoPK;
    }
}
