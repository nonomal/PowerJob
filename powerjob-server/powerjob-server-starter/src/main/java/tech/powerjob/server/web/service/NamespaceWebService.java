package tech.powerjob.server.web.service;

import org.springframework.data.domain.Page;
import tech.powerjob.server.persistence.remote.model.NamespaceDO;
import tech.powerjob.server.web.request.ModifyNamespaceRequest;
import tech.powerjob.server.web.request.QueryNamespaceRequest;

import java.util.List;

/**
 * namespace web 服务
 *
 * @author tjq
 * @since 2024/2/15
 */
public interface NamespaceWebService {

    NamespaceDO save(ModifyNamespaceRequest req);

    void delete(Long id);

    Page<NamespaceDO> list(QueryNamespaceRequest queryNamespaceRequest);

    List<NamespaceDO> listAll();
}
