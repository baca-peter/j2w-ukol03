package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final List<Vizitka> vizitky;

  public VizitkaController() {
    vizitky = Arrays.asList(
            new Vizitka("Dita (Přikrylová) Formánková", "Czechitas", "Václavské náměstí 837/11", "11000 Praha 1", "dita@czechitas.cs", "+420 800123456", "www.czechitas.cz"),
            new Vizitka("Barbora Bühnová", "Czechitas", "Škrobárenská 511/3", "617 00 Brno", null, "+420 800123457", "www.czechitas.cz"),
            new Vizitka("Monika Ptáčníková", "Czechitas", "17. listopadu 15/2172", "708 33 Ostrava-Poruba", "monika@czechitas.cs", "+420 800123458", "www.czechitas.cz"),
            new Vizitka("Mirka Zatloukalová", "Czechitas", "Lipová 1789/9", "370 05 České Budějovice", "mirka@czechitas.cs", null, "www.czechitas.cz"),
            new Vizitka("Peter Bača", "Czechitas", "Česká 161/1", "602 00 Brno-střed", null, null, null)
    );
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", vizitky);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", vizitky.get(id));
    return modelAndView;
  }
}
