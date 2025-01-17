package hva.app.animal;

import hva.core.Hotel;
import hva.app.exception.DuplicateAnimalKeyException;
import hva.app.exception.UnknownHabitatKeyException;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Register a new animal in this zoo hotel.
 */
class DoRegisterAnimal extends Command<Hotel> {

  DoRegisterAnimal(Hotel receiver) {
    super(Label.REGISTER_ANIMAL, receiver);
    //FIXME add command fields
  }
  
  @Override
  protected final void execute() throws CommandException {
    Form _animal = new Form("Animal");
    _animal.addStringField("animalId", hva.app.animal.Prompt.animalKey());
    _animal.addStringField("name", hva.app.animal.Prompt.animalName());
    _animal.addStringField("speciesId", hva.app.animal.Prompt.speciesKey());
    _animal.addStringField("habitatId", hva.app.habitat.Prompt.habitatKey());
  }
}
