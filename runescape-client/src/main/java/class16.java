import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public abstract class class16 extends Node {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2104011211
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 2074784147
	)
	@Export("menuX")
	static int menuX;

	class16() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	abstract void vmethod356(Buffer var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	abstract void vmethod352(class3 var1);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;I)Ljava/lang/String;",
		garbageValue = "-1639083149"
	)
	public static String method258(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class227.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class303.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2104011211"
	)
	static final void method259() {
		ApproximateRouteStrategy.method1205();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		KitDefinition.KitDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		MusicPatchPcmStream.method4123();
		WorldMapLabelSize.method2678();
		class22.method320();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		WorldMapAreaData.method3212();
		VarpDefinition.VarpDefinition_cached.clear();
		Clock.method2600();
		WorldMapLabelSize.method2676();
		ParamDefinition.method5096();
		ParamDefinition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		ReflectionCheck.method1172();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		TriBool.archive0.clearFiles();
		class367.archive1.clearFiles();
		class5.archive3.clearFiles();
		ItemContainer.archive4.clearFiles();
		class157.archive5.clearFiles();
		class8.archive6.clearFiles();
		class12.archive7.clearFiles();
		SoundSystem.archive8.clearFiles();
		AbstractWorldMapData.archive9.clearFiles();
		class373.archive10.clearFiles();
		class10.archive11.clearFiles();
		BuddyRankComparator.archive12.clearFiles();
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		signature = "(IIIIIIIIIB)V",
		garbageValue = "-60"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			long var11 = 0L;
			int var13 = -1;
			int var14 = 0;
			int var15 = 0;
			if (var9.type == 0) {
				var11 = WorldMapArea.scene.getBoundaryObjectTag(var9.plane, var9.x, var9.y);
			}

			if (var9.type == 1) {
				var11 = WorldMapArea.scene.getWallDecorationTag(var9.plane, var9.x, var9.y);
			}

			if (var9.type == 2) {
				var11 = WorldMapArea.scene.getGameObjectTag(var9.plane, var9.x, var9.y);
			}

			if (var9.type == 3) {
				var11 = WorldMapArea.scene.getFloorDecorationTag(var9.plane, var9.x, var9.y);
			}

			if (0L != var11) {
				int var16 = WorldMapArea.scene.getObjectFlags(var9.plane, var9.x, var9.y, var11);
				var13 = WorldMapSection1.Entity_unpackID(var11);
				var14 = var16 & 31;
				var15 = var16 >> 6 & 3;
			}

			var9.objectId = var13;
			var9.field1203 = var14;
			var9.field1199 = var15;
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1196 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}
