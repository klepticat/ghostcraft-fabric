package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.klepticat.ghostcraft.data.GCBlockTagProvider;
import org.klepticat.ghostcraft.data.GCItemTagProvider;
import org.klepticat.ghostcraft.data.GCModelProvider;

public class GhostCraftDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(GCModelProvider::new);
        GCBlockTagProvider blockTagProvider = pack.addProvider(GCBlockTagProvider::new);
        pack.addProvider((output, registriesFuture) -> new GCItemTagProvider(output, registriesFuture, blockTagProvider));
    }
}
