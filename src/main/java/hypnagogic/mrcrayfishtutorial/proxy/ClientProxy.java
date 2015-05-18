package hypnagogic.mrcrayfishtutorial.proxy;

import hypnagogic.mrcrayfishtutorial.init.TutorialBlocks;
import hypnagogic.mrcrayfishtutorial.init.TutorialItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		TutorialBlocks.registerRenders();
		TutorialItems.registerRenders();
	}
}
