import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class89 {
	@ObfuscatedName("z")
	static final BigInteger field1166;
	@ObfuscatedName("q")
	static final BigInteger field1167;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	static Bounds field1163;

	static {
		field1166 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field1167 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Lbk;",
		garbageValue = "971686415"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "39"
	)
	static void method2163() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1284[var0] = null;
			Players.field1295[var0] = 1;
		}

	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1081555887"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		NetFileRequest.method4292();
		MidiPcmStream.method3970();
		KitDefinition.KitDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		TileItem.method2239();
		class200.method3803();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		Projectile.method2228();
		class234.method4261();
		MouseRecorder.method1283();
		GrandExchangeOfferAgeComparator.method242();
		WorldMapIcon_0.method297();
		StructDefinition.method4699();
		ParamDefinition.ParamDefinition_cached.clear();
		class13.method150();
		WorldMapIcon_1.method398();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		MenuAction.archive0.clearFiles();
		WorldMapManager.archive1.clearFiles();
		FaceNormal.archive3.clearFiles();
		Username.archive4.clearFiles();
		Varcs.archive5.clearFiles();
		ApproximateRouteStrategy.archive6.clearFiles();
		class236.archive7.clearFiles();
		GrandExchangeOffer.archive8.clearFiles();
		WorldMapData_1.archive9.clearFiles();
		class281.archive10.clearFiles();
		AbstractByteArrayCopier.archive11.clearFiles();
		ViewportMouse.archive12.clearFiles();
		ModeWhere.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		VertexNormal.method3133(2);
		Client.currentTrackGroupId = -1;
		Client.field916 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				GrandExchangeEvents.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				GrandExchangeEvents.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		BuddyRankComparator.updateGameState(10);
	}
}
