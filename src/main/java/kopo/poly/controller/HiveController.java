package kopo.poly.controller;

import kopo.poly.dto.HiveDTO;
import kopo.poly.service.IHiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class HiveController {

    @Resource(name = "HiveService")
    private IHiveService hiveService;

    @GetMapping(value = "hive/getComediesCount")
    public HiveDTO getComediesCount(ModelMap modle)
        throws Exception {

        log.info(this.getClass().getName() + ".getComediesCount start!");

        HiveDTO rDTO = hiveService.getComediesCount();

        if (rDTO == null) {
            rDTO = new HiveDTO();
        }

        log.info(this.getClass().getName() + ".getComediesCount End!");

        return rDTO;
    }
}
