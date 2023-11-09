import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class9 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	public static final class9 field43;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	public static final class9 field41;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	static final class9 field38;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	static final class9 field39;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	static final class9 field40;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -975874631
	)
	static int field42;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1575723661
	)
	int field47;
	@ObfuscatedName("z")
	String field46;
	@ObfuscatedName("j")
	boolean field37;
	@ObfuscatedName("h")
	boolean field44;

	static {
		field43 = new class9(0, "POST", true, true); // L: 6
		field41 = new class9(1, "GET", true, false); // L: 7
		field38 = new class9(2, "PUT", false, true); // L: 8
		field39 = new class9(3, "PATCH", false, true); // L: 9
		field40 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field47 = var1; // L: 17
		this.field46 = var2; // L: 18
		this.field37 = var3; // L: 19
		this.field44 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field47; // L: 37
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method68() {
		return this.field37; // L: 24
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1777015253"
	)
	public String method79() {
		return this.field46; // L: 28
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-38"
	)
	boolean method70() {
		return this.field44; // L: 32
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llu;IB)V",
		garbageValue = "92"
	)
	public static void method81(Archive var0, int var1) {
		Skills.field3568.offset = var1 * 8 + 5; // L: 87
		if (Skills.field3568.offset >= Skills.field3568.array.length) { // L: 88
			if (var0.field3994) { // L: 89
				var0.method5816(); // L: 90
			} else {
				throw new RuntimeException(""); // L: 93
			}
		} else {
			int var2 = Skills.field3568.readInt(); // L: 95
			int var3 = Skills.field3568.readInt(); // L: 96
			var0.loadIndex(var2, var3); // L: 97
		}
	} // L: 91 98

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	static final void method80() {
		VarpDefinition.method3352(); // L: 2978
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2980
		KitDefinition.KitDefinition_cached.clear(); // L: 2983
		CollisionMap.method3890(); // L: 2985
		NPCComposition.NpcDefinition_cached.clear(); // L: 2987
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2988
		ItemComposition.ItemComposition_cached.clear(); // L: 2991
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 2992
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2993
		Message.method1062(); // L: 2995
		class145.method3087(); // L: 2996
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2998
		UserComparator1.method8034(); // L: 3000
		class398.HitSplatDefinition_cachedSprites.method7552(); // L: 3001
		class6.Ignored_cached.method7552(); // L: 3002
		ItemComposition.method3782(); // L: 3003
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 3005
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 3006
		StructComposition.StructDefinition_cached.clear(); // L: 3009
		ParamComposition.ParamComposition_cached.clear(); // L: 3012
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 3015
		class436.DBTableType_cache.clear(); // L: 3018
		class92.method2441(); // L: 3020
		Client.Widget_cachedModels.clear(); // L: 3021
		Client.Widget_cachedFonts.clear(); // L: 3022
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 3024
		Widget.Widget_cachedSprites.clear(); // L: 3027
		Widget.Widget_cachedModels.clear(); // L: 3028
		Widget.Widget_cachedFonts.clear(); // L: 3029
		Widget.Widget_cachedSpriteMasks.clear(); // L: 3030
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3032
		Script.Script_cached.clear(); // L: 3033
		Calendar.archive5.clearFiles(); // L: 3034
		Calendar.field3297.clearFiles(); // L: 3035
		Skills.archive7.clearFiles(); // L: 3036
		WorldMapArchiveLoader.archive4.clearFiles(); // L: 3037
		class21.archive9.clearFiles(); // L: 3038
		MouseHandler.archive6.clearFiles(); // L: 3039
		TaskHandler.archive11.clearFiles(); // L: 3040
		AbstractWorldMapData.archive8.clearFiles(); // L: 3041
		class293.field3349.clearFiles(); // L: 3042
		Actor.archive10.clearFiles(); // L: 3043
		WorldMapRegion.field2708.clearFiles(); // L: 3044
		class117.archive12.clearFiles(); // L: 3045
		BuddyRankComparator.field1380.clearFiles(); // L: 3046
	} // L: 3047

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "422213026"
	)
	static final void method78(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 8579
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1) { // L: 8580
			Client.mouseCrossX = var7; // L: 8642
			Client.mouseCrossY = var8; // L: 8643
			Client.mouseCrossColor = 2; // L: 8644
			Client.mouseCrossState = 0; // L: 8645
			Client.destinationX = var0; // L: 8646
			Client.destinationY = var1; // L: 8647
			var9 = class433.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher); // L: 8649
			var9.packetBuffer.method7969(class300.baseX * 64 + var0); // L: 8650
			var9.packetBuffer.method7771(GrandExchangeOfferOwnWorldComparator.selectedItemSlot); // L: 8651
			var9.packetBuffer.method7771(Message.baseY * 64 + var1); // L: 8652
			var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8653
			var9.packetBuffer.writeIntME(class358.selectedItemId); // L: 8654
			var9.packetBuffer.method7784(GraphicsObject.selectedItemWidget); // L: 8655
			var9.packetBuffer.method7771(var3); // L: 8656
			Client.packetWriter.addNode(var9); // L: 8657
		} else if (var2 == 2) {
			Client.mouseCrossX = var7; // L: 9133
			Client.mouseCrossY = var8; // L: 9134
			Client.mouseCrossColor = 2; // L: 9135
			Client.mouseCrossState = 0; // L: 9136
			Client.destinationX = var0; // L: 9137
			Client.destinationY = var1; // L: 9138
			var9 = class433.getPacketBufferNode(ClientPacket.field2934, Client.packetWriter.isaacCipher); // L: 9139
			var9.packetBuffer.method7771(Client.selectedSpellChildIndex); // L: 9140
			var9.packetBuffer.writeShort(Message.baseY * 64 + var1); // L: 9141
			var9.packetBuffer.method7771(class300.baseX * 64 + var0); // L: 9142
			var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9143
			var9.packetBuffer.method7784(class113.selectedSpellWidget); // L: 9144
			var9.packetBuffer.method7969(var3); // L: 9145
			var9.packetBuffer.method7832(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9146
			Client.packetWriter.addNode(var9); // L: 9147
		} else if (var2 == 3) {
			Client.mouseCrossX = var7; // L: 8733
			Client.mouseCrossY = var8; // L: 8734
			Client.mouseCrossColor = 2; // L: 8735
			Client.mouseCrossState = 0; // L: 8736
			Client.destinationX = var0; // L: 8737
			Client.destinationY = var1; // L: 8738
			var9 = class433.getPacketBufferNode(ClientPacket.field2942, Client.packetWriter.isaacCipher); // L: 8740
			var9.packetBuffer.writeShort(class300.baseX * 64 + var0); // L: 8741
			var9.packetBuffer.method7771(Message.baseY * 64 + var1); // L: 8742
			var9.packetBuffer.writeShort(var3); // L: 8743
			var9.packetBuffer.method7832(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8744
			Client.packetWriter.addNode(var9); // L: 8745
		} else if (var2 == 4) {
			Client.mouseCrossX = var7; // L: 9333
			Client.mouseCrossY = var8; // L: 9334
			Client.mouseCrossColor = 2; // L: 9335
			Client.mouseCrossState = 0; // L: 9336
			Client.destinationX = var0; // L: 9337
			Client.destinationY = var1; // L: 9338
			var9 = class433.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher); // L: 9340
			var9.packetBuffer.writeIntME(var3); // L: 9341
			var9.packetBuffer.writeIntME(class300.baseX * 64 + var0); // L: 9342
			var9.packetBuffer.method7771(Message.baseY * 64 + var1); // L: 9343
			var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9344
			Client.packetWriter.addNode(var9); // L: 9345
		} else if (var2 == 5) {
			Client.mouseCrossX = var7; // L: 8596
			Client.mouseCrossY = var8; // L: 8597
			Client.mouseCrossColor = 2; // L: 8598
			Client.mouseCrossState = 0; // L: 8599
			Client.destinationX = var0; // L: 8600
			Client.destinationY = var1; // L: 8601
			var9 = class433.getPacketBufferNode(ClientPacket.field2991, Client.packetWriter.isaacCipher); // L: 8603
			var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8604
			var9.packetBuffer.writeIntME(Message.baseY * 64 + var1); // L: 8605
			var9.packetBuffer.method7969(var3); // L: 8606
			var9.packetBuffer.writeShort(class300.baseX * 64 + var0); // L: 8607
			Client.packetWriter.addNode(var9); // L: 8608
		} else if (var2 == 6) {
			Client.mouseCrossX = var7; // L: 9187
			Client.mouseCrossY = var8; // L: 9188
			Client.mouseCrossColor = 2; // L: 9189
			Client.mouseCrossState = 0; // L: 9190
			Client.destinationX = var0; // L: 9191
			Client.destinationY = var1; // L: 9192
			var9 = class433.getPacketBufferNode(ClientPacket.field3004, Client.packetWriter.isaacCipher); // L: 9194
			var9.packetBuffer.writeShort(class300.baseX * 64 + var0); // L: 9195
			var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9196
			var9.packetBuffer.writeIntME(var3); // L: 9197
			var9.packetBuffer.method7771(Message.baseY * 64 + var1); // L: 9198
			Client.packetWriter.addNode(var9); // L: 9199
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3]; // L: 9236
				if (var14 != null) { // L: 9237
					Client.mouseCrossX = var7; // L: 9238
					Client.mouseCrossY = var8; // L: 9239
					Client.mouseCrossColor = 2; // L: 9240
					Client.mouseCrossState = 0; // L: 9241
					Client.destinationX = var0; // L: 9242
					Client.destinationY = var1; // L: 9243
					var10 = class433.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 9245
					var10.packetBuffer.writeIntME(var3); // L: 9246
					var10.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9247
					var10.packetBuffer.method7771(GrandExchangeOfferOwnWorldComparator.selectedItemSlot); // L: 9248
					var10.packetBuffer.method7771(class358.selectedItemId); // L: 9249
					var10.packetBuffer.method7783(GraphicsObject.selectedItemWidget); // L: 9250
					Client.packetWriter.addNode(var10); // L: 9251
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3]; // L: 8828
				if (var14 != null) { // L: 8829
					Client.mouseCrossX = var7; // L: 8830
					Client.mouseCrossY = var8; // L: 8831
					Client.mouseCrossColor = 2; // L: 8832
					Client.mouseCrossState = 0; // L: 8833
					Client.destinationX = var0; // L: 8834
					Client.destinationY = var1; // L: 8835
					var10 = class433.getPacketBufferNode(ClientPacket.field3013, Client.packetWriter.isaacCipher); // L: 8836
					var10.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8837
					var10.packetBuffer.writeInt(class113.selectedSpellWidget); // L: 8838
					var10.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 8839
					var10.packetBuffer.method7969(Client.selectedSpellChildIndex); // L: 8840
					var10.packetBuffer.writeShort(var3); // L: 8841
					Client.packetWriter.addNode(var10); // L: 8842
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3]; // L: 9255
				if (var14 != null) { // L: 9256
					Client.mouseCrossX = var7; // L: 9257
					Client.mouseCrossY = var8; // L: 9258
					Client.mouseCrossColor = 2; // L: 9259
					Client.mouseCrossState = 0; // L: 9260
					Client.destinationX = var0; // L: 9261
					Client.destinationY = var1; // L: 9262
					var10 = class433.getPacketBufferNode(ClientPacket.field3009, Client.packetWriter.isaacCipher); // L: 9264
					var10.packetBuffer.method7771(var3); // L: 9265
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9266
					Client.packetWriter.addNode(var10); // L: 9267
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3]; // L: 8887
				if (var14 != null) { // L: 8888
					Client.mouseCrossX = var7; // L: 8889
					Client.mouseCrossY = var8; // L: 8890
					Client.mouseCrossColor = 2; // L: 8891
					Client.mouseCrossState = 0; // L: 8892
					Client.destinationX = var0; // L: 8893
					Client.destinationY = var1; // L: 8894
					var10 = class433.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher); // L: 8896
					var10.packetBuffer.method7832(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8897
					var10.packetBuffer.method7771(var3); // L: 8898
					Client.packetWriter.addNode(var10); // L: 8899
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3]; // L: 9117
				if (var14 != null) { // L: 9118
					Client.mouseCrossX = var7; // L: 9119
					Client.mouseCrossY = var8; // L: 9120
					Client.mouseCrossColor = 2; // L: 9121
					Client.mouseCrossState = 0; // L: 9122
					Client.destinationX = var0; // L: 9123
					Client.destinationY = var1; // L: 9124
					var10 = class433.getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher); // L: 9126
					var10.packetBuffer.method7969(var3); // L: 9127
					var10.packetBuffer.method7832(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9128
					Client.packetWriter.addNode(var10); // L: 9129
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3]; // L: 8687
				if (var14 != null) { // L: 8688
					Client.mouseCrossX = var7; // L: 8689
					Client.mouseCrossY = var8; // L: 8690
					Client.mouseCrossColor = 2; // L: 8691
					Client.mouseCrossState = 0; // L: 8692
					Client.destinationX = var0; // L: 8693
					Client.destinationY = var1; // L: 8694
					var10 = class433.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher); // L: 8696
					var10.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8697
					var10.packetBuffer.method7771(var3); // L: 8698
					Client.packetWriter.addNode(var10); // L: 8699
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3]; // L: 9359
				if (var14 != null) { // L: 9360
					Client.mouseCrossX = var7; // L: 9361
					Client.mouseCrossY = var8; // L: 9362
					Client.mouseCrossColor = 2; // L: 9363
					Client.mouseCrossState = 0; // L: 9364
					Client.destinationX = var0; // L: 9365
					Client.destinationY = var1; // L: 9366
					var10 = class433.getPacketBufferNode(ClientPacket.field2921, Client.packetWriter.isaacCipher); // L: 9368
					var10.packetBuffer.writeShort(var3); // L: 9369
					var10.packetBuffer.method7832(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9370
					Client.packetWriter.addNode(var10); // L: 9371
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3]; // L: 8946
					if (var16 != null) { // L: 8947
						Client.mouseCrossX = var7; // L: 8948
						Client.mouseCrossY = var8; // L: 8949
						Client.mouseCrossColor = 2; // L: 8950
						Client.mouseCrossState = 0; // L: 8951
						Client.destinationX = var0; // L: 8952
						Client.destinationY = var1; // L: 8953
						var10 = class433.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher); // L: 8955
						var10.packetBuffer.method7771(GrandExchangeOfferOwnWorldComparator.selectedItemSlot); // L: 8956
						var10.packetBuffer.writeIntME(class358.selectedItemId); // L: 8957
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8958
						var10.packetBuffer.writeIntME(var3); // L: 8959
						var10.packetBuffer.method7784(GraphicsObject.selectedItemWidget); // L: 8960
						Client.packetWriter.addNode(var10); // L: 8961
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3]; // L: 8995
					if (var16 != null) { // L: 8996
						Client.mouseCrossX = var7; // L: 8997
						Client.mouseCrossY = var8; // L: 8998
						Client.mouseCrossColor = 2; // L: 8999
						Client.mouseCrossState = 0; // L: 9000
						Client.destinationX = var0; // L: 9001
						Client.destinationY = var1; // L: 9002
						var10 = class433.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher); // L: 9003
						var10.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9004
						var10.packetBuffer.writeIntME(var3); // L: 9005
						var10.packetBuffer.method7969(Client.selectedSpellItemId); // L: 9006
						var10.packetBuffer.method7785(class113.selectedSpellWidget); // L: 9007
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9008
						Client.packetWriter.addNode(var10); // L: 9009
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7; // L: 9282
					Client.mouseCrossY = var8; // L: 9283
					Client.mouseCrossColor = 2; // L: 9284
					Client.mouseCrossState = 0; // L: 9285
					Client.destinationX = var0; // L: 9286
					Client.destinationY = var1; // L: 9287
					var9 = class433.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher); // L: 9289
					var9.packetBuffer.method7969(var3); // L: 9290
					var9.packetBuffer.method7784(GraphicsObject.selectedItemWidget); // L: 9291
					var9.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9292
					var9.packetBuffer.writeShort(class358.selectedItemId); // L: 9293
					var9.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.selectedItemSlot); // L: 9294
					var9.packetBuffer.writeIntME(class300.baseX * 64 + var0); // L: 9295
					var9.packetBuffer.method7771(Message.baseY * 64 + var1); // L: 9296
					Client.packetWriter.addNode(var9); // L: 9297
				} else if (var2 == 17) {
					Client.mouseCrossX = var7; // L: 9300
					Client.mouseCrossY = var8; // L: 9301
					Client.mouseCrossColor = 2; // L: 9302
					Client.mouseCrossState = 0; // L: 9303
					Client.destinationX = var0; // L: 9304
					Client.destinationY = var1; // L: 9305
					var9 = class433.getPacketBufferNode(ClientPacket.field3012, Client.packetWriter.isaacCipher); // L: 9306
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9307
					var9.packetBuffer.method7783(class113.selectedSpellWidget); // L: 9308
					var9.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9309
					var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9310
					var9.packetBuffer.method7771(Message.baseY * 64 + var1); // L: 9311
					var9.packetBuffer.method7969(class300.baseX * 64 + var0); // L: 9312
					var9.packetBuffer.method7969(var3); // L: 9313
					Client.packetWriter.addNode(var9); // L: 9314
				} else if (var2 == 18) {
					Client.mouseCrossX = var7; // L: 9102
					Client.mouseCrossY = var8; // L: 9103
					Client.mouseCrossColor = 2; // L: 9104
					Client.mouseCrossState = 0; // L: 9105
					Client.destinationX = var0; // L: 9106
					Client.destinationY = var1; // L: 9107
					var9 = class433.getPacketBufferNode(ClientPacket.field2960, Client.packetWriter.isaacCipher); // L: 9109
					var9.packetBuffer.writeIntME(var3); // L: 9110
					var9.packetBuffer.writeShort(class300.baseX * 64 + var0); // L: 9111
					var9.packetBuffer.writeIntME(Message.baseY * 64 + var1); // L: 9112
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9113
					Client.packetWriter.addNode(var9); // L: 9114
				} else if (var2 == 19) {
					Client.mouseCrossX = var7; // L: 9013
					Client.mouseCrossY = var8; // L: 9014
					Client.mouseCrossColor = 2; // L: 9015
					Client.mouseCrossState = 0; // L: 9016
					Client.destinationX = var0; // L: 9017
					Client.destinationY = var1; // L: 9018
					var9 = class433.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher); // L: 9020
					var9.packetBuffer.method7771(Message.baseY * 64 + var1); // L: 9021
					var9.packetBuffer.writeIntME(var3); // L: 9022
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9023
					var9.packetBuffer.method7771(class300.baseX * 64 + var0); // L: 9024
					Client.packetWriter.addNode(var9); // L: 9025
				} else if (var2 == 20) {
					Client.mouseCrossX = var7; // L: 8627
					Client.mouseCrossY = var8; // L: 8628
					Client.mouseCrossColor = 2; // L: 8629
					Client.mouseCrossState = 0; // L: 8630
					Client.destinationX = var0; // L: 8631
					Client.destinationY = var1; // L: 8632
					var9 = class433.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher); // L: 8634
					var9.packetBuffer.writeShort(var3); // L: 8635
					var9.packetBuffer.writeIntME(Message.baseY * 64 + var1); // L: 8636
					var9.packetBuffer.method7771(class300.baseX * 64 + var0); // L: 8637
					var9.packetBuffer.method7832(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8638
					Client.packetWriter.addNode(var9); // L: 8639
				} else if (var2 == 21) {
					Client.mouseCrossX = var7; // L: 8581
					Client.mouseCrossY = var8; // L: 8582
					Client.mouseCrossColor = 2; // L: 8583
					Client.mouseCrossState = 0; // L: 8584
					Client.destinationX = var0; // L: 8585
					Client.destinationY = var1; // L: 8586
					var9 = class433.getPacketBufferNode(ClientPacket.field3003, Client.packetWriter.isaacCipher); // L: 8588
					var9.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8589
					var9.packetBuffer.method7969(Message.baseY * 64 + var1); // L: 8590
					var9.packetBuffer.method7771(var3); // L: 8591
					var9.packetBuffer.method7969(class300.baseX * 64 + var0); // L: 8592
					Client.packetWriter.addNode(var9); // L: 8593
				} else if (var2 == 22) {
					Client.mouseCrossX = var7; // L: 8903
					Client.mouseCrossY = var8; // L: 8904
					Client.mouseCrossColor = 2; // L: 8905
					Client.mouseCrossState = 0; // L: 8906
					Client.destinationX = var0; // L: 8907
					Client.destinationY = var1; // L: 8908
					var9 = class433.getPacketBufferNode(ClientPacket.field2966, Client.packetWriter.isaacCipher); // L: 8910
					var9.packetBuffer.method7969(Message.baseY * 64 + var1); // L: 8911
					var9.packetBuffer.writeIntME(class300.baseX * 64 + var0); // L: 8912
					var9.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8913
					var9.packetBuffer.method7771(var3); // L: 8914
					Client.packetWriter.addNode(var9); // L: 8915
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 9041
						Decimator.scene.setViewportWalking(); // L: 9042
					} else {
						Decimator.scene.menuOpen(FriendSystem.Client_plane, var0, var1, true); // L: 9045
					}
				} else {
					PacketBufferNode var11;
					Widget var17;
					if (var2 == 24) {
						var17 = FloorUnderlayDefinition.getWidget(var1); // L: 8703
						if (var17 != null) { // L: 8704
							boolean var12 = true; // L: 8705
							if (var17.contentType > 0) { // L: 8706
								var12 = ArchiveLoader.method2131(var17);
							}

							if (var12) { // L: 8707
								var11 = class433.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher); // L: 8709
								var11.packetBuffer.writeInt(var1); // L: 8710
								Client.packetWriter.addNode(var11); // L: 8711
							}
						}
					} else {
						if (var2 == 25) {
							var17 = class293.getWidgetChild(var1, var0); // L: 8846
							if (var17 != null) { // L: 8847
								class362.Widget_runOnTargetLeave(); // L: 8848
								class21.selectSpell(var1, var0, WallObject.Widget_unpackTargetMask(class67.getWidgetFlags(var17)), var4); // L: 8849
								Client.isItemSelected = 0; // L: 8850
								Client.selectedSpellActionName = IgnoreList.Widget_getSpellActionName(var17); // L: 8851
								if (Client.selectedSpellActionName == null) { // L: 8852
									Client.selectedSpellActionName = "null";
								}

								if (var17.isIf3) { // L: 8853
									Client.selectedSpellName = var17.dataText + class82.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class82.colorStartTag(65280) + var17.spellName + class82.colorStartTag(16777215); // L: 8854
								}
							}

							return; // L: 8856
						}

						if (var2 == 26) {
							class181.method3547(); // L: 8670
						} else {
							int var13;
							Widget var15;
							if (var2 == 28) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher); // L: 8935
								var9.packetBuffer.writeInt(var1); // L: 8936
								Client.packetWriter.addNode(var9); // L: 8937
								var15 = FloorUnderlayDefinition.getWidget(var1); // L: 8938
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 8939
									var13 = var15.cs1Instructions[0][1]; // L: 8940
									Varps.Varps_main[var13] = 1 - Varps.Varps_main[var13]; // L: 8941
									class155.changeGameOptions(var13); // L: 8942
								}
							} else if (var2 == 29) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher); // L: 8874
								var9.packetBuffer.writeInt(var1); // L: 8875
								Client.packetWriter.addNode(var9); // L: 8876
								var15 = FloorUnderlayDefinition.getWidget(var1); // L: 8877
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 8878
									var13 = var15.cs1Instructions[0][1]; // L: 8879
									if (Varps.Varps_main[var13] != var15.cs1ComparisonValues[0]) { // L: 8880
										Varps.Varps_main[var13] = var15.cs1ComparisonValues[0]; // L: 8881
										class155.changeGameOptions(var13); // L: 8882
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9229
									WorldMapSection2.resumePauseWidget(var1, var0); // L: 9230
									Client.meslayerContinueWidget = class293.getWidgetChild(var1, var0); // L: 9231
									class220.invalidateWidget(Client.meslayerContinueWidget); // L: 9232
								}
							} else if (var2 == 31) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher); // L: 8674
								var9.packetBuffer.method7771(var0); // L: 8675
								var9.packetBuffer.writeInt(GraphicsObject.selectedItemWidget); // L: 8676
								var9.packetBuffer.method7784(var1); // L: 8677
								var9.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.selectedItemSlot); // L: 8678
								var9.packetBuffer.method7771(var4); // L: 8679
								var9.packetBuffer.writeShort(class358.selectedItemId); // L: 8680
								Client.packetWriter.addNode(var9); // L: 8681
								Client.field601 = 0; // L: 8682
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 8683
								Client.field602 = var0; // L: 8684
							} else if (var2 == 32) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher); // L: 9029
								var9.packetBuffer.method7783(var1); // L: 9030
								var9.packetBuffer.writeIntME(var0); // L: 9031
								var9.packetBuffer.writeInt(class113.selectedSpellWidget); // L: 9032
								var9.packetBuffer.method7969(Client.selectedSpellChildIndex); // L: 9033
								var9.packetBuffer.method7969(var4); // L: 9034
								Client.packetWriter.addNode(var9); // L: 9035
								Client.field601 = 0; // L: 9036
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 9037
								Client.field602 = var0; // L: 9038
							} else if (var2 == 33) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher); // L: 9177
								var9.packetBuffer.method7783(var1); // L: 9178
								var9.packetBuffer.method7771(var4); // L: 9179
								var9.packetBuffer.method7771(var0); // L: 9180
								Client.packetWriter.addNode(var9); // L: 9181
								Client.field601 = 0; // L: 9182
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 9183
								Client.field602 = var0; // L: 9184
							} else if (var2 == 34) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher); // L: 8723
								var9.packetBuffer.writeShort(var4); // L: 8724
								var9.packetBuffer.writeInt(var1); // L: 8725
								var9.packetBuffer.method7969(var0); // L: 8726
								Client.packetWriter.addNode(var9); // L: 8727
								Client.field601 = 0; // L: 8728
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 8729
								Client.field602 = var0; // L: 8730
							} else if (var2 == 35) {
								var9 = class433.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher); // L: 9272
								var9.packetBuffer.method7771(var0); // L: 9273
								var9.packetBuffer.method7785(var1); // L: 9274
								var9.packetBuffer.writeShort(var4); // L: 9275
								Client.packetWriter.addNode(var9); // L: 9276
								Client.field601 = 0; // L: 9277
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 9278
								Client.field602 = var0; // L: 9279
							} else if (var2 == 36) {
								var9 = class433.getPacketBufferNode(ClientPacket.field3010, Client.packetWriter.isaacCipher); // L: 9203
								var9.packetBuffer.method7785(var1); // L: 9204
								var9.packetBuffer.method7771(var4); // L: 9205
								var9.packetBuffer.writeIntME(var0); // L: 9206
								Client.packetWriter.addNode(var9); // L: 9207
								Client.field601 = 0; // L: 9208
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 9209
								Client.field602 = var0; // L: 9210
							} else if (var2 == 37) {
								var9 = class433.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 9349
								var9.packetBuffer.method7969(var4); // L: 9350
								var9.packetBuffer.method7784(var1); // L: 9351
								var9.packetBuffer.method7771(var0); // L: 9352
								Client.packetWriter.addNode(var9); // L: 9353
								Client.field601 = 0; // L: 9354
								class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 9355
								Client.field602 = var0; // L: 9356
							} else {
								if (var2 == 38) {
									class362.Widget_runOnTargetLeave(); // L: 8786
									var17 = FloorUnderlayDefinition.getWidget(var1); // L: 8787
									Client.isItemSelected = 1; // L: 8788
									GrandExchangeOfferOwnWorldComparator.selectedItemSlot = var0; // L: 8789
									GraphicsObject.selectedItemWidget = var1; // L: 8790
									class358.selectedItemId = var4; // L: 8791
									class220.invalidateWidget(var17); // L: 8792
									Client.selectedItemName = class82.colorStartTag(16748608) + class258.ItemComposition_get(var4).name + class82.colorStartTag(16777215); // L: 8793
									if (Client.selectedItemName == null) { // L: 8794
										Client.selectedItemName = "null";
									}

									return; // L: 8795
								}

								if (var2 == 39) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2910, Client.packetWriter.isaacCipher); // L: 8776
									var9.packetBuffer.writeIntME(var4); // L: 8777
									var9.packetBuffer.method7783(var1); // L: 8778
									var9.packetBuffer.writeShort(var0); // L: 8779
									Client.packetWriter.addNode(var9); // L: 8780
									Client.field601 = 0; // L: 8781
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 8782
									Client.field602 = var0; // L: 8783
								} else if (var2 == 40) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2924, Client.packetWriter.isaacCipher); // L: 8985
									var9.packetBuffer.method7771(var4); // L: 8986
									var9.packetBuffer.method7785(var1); // L: 8987
									var9.packetBuffer.method7969(var0); // L: 8988
									Client.packetWriter.addNode(var9); // L: 8989
									Client.field601 = 0; // L: 8990
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 8991
									Client.field602 = var0; // L: 8992
								} else if (var2 == 41) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2941, Client.packetWriter.isaacCipher); // L: 8765
									var9.packetBuffer.method7785(var1); // L: 8766
									var9.packetBuffer.method7771(var4); // L: 8767
									var9.packetBuffer.writeShort(var0); // L: 8768
									Client.packetWriter.addNode(var9); // L: 8769
									Client.field601 = 0; // L: 8770
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 8771
									Client.field602 = var0; // L: 8772
								} else if (var2 == 42) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2944, Client.packetWriter.isaacCipher); // L: 9092
									var9.packetBuffer.method7785(var1); // L: 9093
									var9.packetBuffer.writeShort(var0); // L: 9094
									var9.packetBuffer.method7969(var4); // L: 9095
									Client.packetWriter.addNode(var9); // L: 9096
									Client.field601 = 0; // L: 9097
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 9098
									Client.field602 = var0; // L: 9099
								} else if (var2 == 43) {
									var9 = class433.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher); // L: 9050
									var9.packetBuffer.method7969(var0); // L: 9051
									var9.packetBuffer.method7771(var4); // L: 9052
									var9.packetBuffer.method7783(var1); // L: 9053
									Client.packetWriter.addNode(var9); // L: 9054
									Client.field601 = 0; // L: 9055
									class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 9056
									Client.field602 = var0; // L: 9057
								} else if (var2 == 44) {
									var16 = Client.players[var3]; // L: 8611
									if (var16 != null) { // L: 8612
										Client.mouseCrossX = var7; // L: 8613
										Client.mouseCrossY = var8; // L: 8614
										Client.mouseCrossColor = 2; // L: 8615
										Client.mouseCrossState = 0; // L: 8616
										Client.destinationX = var0; // L: 8617
										Client.destinationY = var1; // L: 8618
										var10 = class433.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher); // L: 8620
										var10.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8621
										var10.packetBuffer.method7969(var3); // L: 8622
										Client.packetWriter.addNode(var10); // L: 8623
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3]; // L: 9075
									if (var16 != null) { // L: 9076
										Client.mouseCrossX = var7; // L: 9077
										Client.mouseCrossY = var8; // L: 9078
										Client.mouseCrossColor = 2; // L: 9079
										Client.mouseCrossState = 0; // L: 9080
										Client.destinationX = var0; // L: 9081
										Client.destinationY = var1; // L: 9082
										var10 = class433.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 9084
										var10.packetBuffer.method7771(var3); // L: 9085
										var10.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9086
										Client.packetWriter.addNode(var10); // L: 9087
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3]; // L: 9213
									if (var16 != null) { // L: 9214
										Client.mouseCrossX = var7; // L: 9215
										Client.mouseCrossY = var8; // L: 9216
										Client.mouseCrossColor = 2; // L: 9217
										Client.mouseCrossState = 0; // L: 9218
										Client.destinationX = var0; // L: 9219
										Client.destinationY = var1; // L: 9220
										var10 = class433.getPacketBufferNode(ClientPacket.field2912, Client.packetWriter.isaacCipher); // L: 9222
										var10.packetBuffer.method7771(var3); // L: 9223
										var10.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9224
										Client.packetWriter.addNode(var10); // L: 9225
									}
								} else if (var2 == 47) {
									var16 = Client.players[var3]; // L: 8965
									if (var16 != null) { // L: 8966
										Client.mouseCrossX = var7; // L: 8967
										Client.mouseCrossY = var8; // L: 8968
										Client.mouseCrossColor = 2; // L: 8969
										Client.mouseCrossState = 0; // L: 8970
										Client.destinationX = var0; // L: 8971
										Client.destinationY = var1; // L: 8972
										var10 = class433.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher); // L: 8974
										var10.packetBuffer.method7969(var3); // L: 8975
										var10.packetBuffer.method7764(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8976
										Client.packetWriter.addNode(var10); // L: 8977
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3]; // L: 8918
									if (var16 != null) { // L: 8919
										Client.mouseCrossX = var7; // L: 8920
										Client.mouseCrossY = var8; // L: 8921
										Client.mouseCrossColor = 2; // L: 8922
										Client.mouseCrossState = 0; // L: 8923
										Client.destinationX = var0; // L: 8924
										Client.destinationY = var1; // L: 8925
										var10 = class433.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher); // L: 8927
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8928
										var10.packetBuffer.method7771(var3); // L: 8929
										Client.packetWriter.addNode(var10); // L: 8930
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3]; // L: 9317
									if (var16 != null) { // L: 9318
										Client.mouseCrossX = var7; // L: 9319
										Client.mouseCrossY = var8; // L: 9320
										Client.mouseCrossColor = 2; // L: 9321
										Client.mouseCrossState = 0; // L: 9322
										Client.destinationX = var0; // L: 9323
										Client.destinationY = var1; // L: 9324
										var10 = class433.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher); // L: 9326
										var10.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9327
										var10.packetBuffer.method7969(var3); // L: 9328
										Client.packetWriter.addNode(var10); // L: 9329
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3]; // L: 9160
									if (var16 != null) { // L: 9161
										Client.mouseCrossX = var7; // L: 9162
										Client.mouseCrossY = var8; // L: 9163
										Client.mouseCrossColor = 2; // L: 9164
										Client.mouseCrossState = 0; // L: 9165
										Client.destinationX = var0; // L: 9166
										Client.destinationY = var1; // L: 9167
										var10 = class433.getPacketBufferNode(ClientPacket.field3002, Client.packetWriter.isaacCipher); // L: 9169
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9170
										var10.packetBuffer.writeIntME(var3); // L: 9171
										Client.packetWriter.addNode(var10); // L: 9172
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3]; // L: 8748
									if (var16 != null) { // L: 8749
										Client.mouseCrossX = var7; // L: 8750
										Client.mouseCrossY = var8; // L: 8751
										Client.mouseCrossColor = 2; // L: 8752
										Client.mouseCrossState = 0; // L: 8753
										Client.destinationX = var0; // L: 8754
										Client.destinationY = var1; // L: 8755
										var10 = class433.getPacketBufferNode(ClientPacket.field2911, Client.packetWriter.isaacCipher); // L: 8757
										var10.packetBuffer.writeShort(var3); // L: 8758
										var10.packetBuffer.method7762(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8759
										Client.packetWriter.addNode(var10); // L: 8760
									}
								} else {
									label653: {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = class293.getWidgetChild(var1, var0); // L: 8859
												if (var17 != null) { // L: 8860
													var10 = class433.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher); // L: 8862
													var10.packetBuffer.method7969(var0); // L: 8863
													var10.packetBuffer.method7784(var1); // L: 8864
													var10.packetBuffer.method7771(Client.selectedSpellItemId); // L: 8865
													var10.packetBuffer.method7785(class113.selectedSpellWidget); // L: 8866
													var10.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 8867
													var10.packetBuffer.writeShort(var4); // L: 8868
													Client.packetWriter.addNode(var10); // L: 8869
												}
												break label653;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var7; // L: 9060
												Client.mouseCrossY = var8; // L: 9061
												Client.mouseCrossColor = 2; // L: 9062
												Client.mouseCrossState = 0; // L: 9063
												Client.destinationX = var0; // L: 9064
												Client.destinationY = var1; // L: 9065
												var9 = class433.getPacketBufferNode(ClientPacket.field2951, Client.packetWriter.isaacCipher); // L: 9067
												var9.packetBuffer.writeShort(Message.baseY * 64 + var1); // L: 9068
												var9.packetBuffer.writeShort(class300.baseX * 64 + var0); // L: 9069
												var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9070
												var9.packetBuffer.writeShort(var3); // L: 9071
												Client.packetWriter.addNode(var9); // L: 9072
												break label653;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var7; // L: 8660
												Client.mouseCrossY = var8; // L: 8661
												Client.mouseCrossColor = 2; // L: 8662
												Client.mouseCrossState = 0; // L: 8663
												var9 = class433.getPacketBufferNode(ClientPacket.field2930, Client.packetWriter.isaacCipher); // L: 8665
												var9.packetBuffer.method7771(var3); // L: 8666
												Client.packetWriter.addNode(var9); // L: 8667
												break label653;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var7; // L: 8811
												Client.mouseCrossY = var8; // L: 8812
												Client.mouseCrossColor = 2; // L: 8813
												Client.mouseCrossState = 0; // L: 8814
												var14 = Client.npcs[var3]; // L: 8815
												if (var14 != null) { // L: 8816
													NPCComposition var18 = var14.definition; // L: 8817
													if (var18.transforms != null) { // L: 8818
														var18 = var18.transform();
													}

													if (var18 != null) { // L: 8819
														var11 = class433.getPacketBufferNode(ClientPacket.field3015, Client.packetWriter.isaacCipher); // L: 8821
														var11.packetBuffer.writeIntME(var18.id); // L: 8822
														Client.packetWriter.addNode(var11); // L: 8823
													}
												}
												break label653;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var7; // L: 9150
												Client.mouseCrossY = var8; // L: 9151
												Client.mouseCrossColor = 2; // L: 9152
												Client.mouseCrossState = 0; // L: 9153
												var9 = class433.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 9155
												var9.packetBuffer.method7771(var3); // L: 9156
												Client.packetWriter.addNode(var9); // L: 9157
												break label653;
											}

											if (var2 == 1005) {
												var17 = FloorUnderlayDefinition.getWidget(var1); // L: 8798
												if (var17 != null && var17.itemQuantities[var0] >= 100000) { // L: 8799
													FileSystem.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + class258.ItemComposition_get(var4).name);
												} else {
													var10 = class433.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 8802
													var10.packetBuffer.method7771(var4); // L: 8803
													Client.packetWriter.addNode(var10); // L: 8804
												}

												Client.field601 = 0; // L: 8806
												class121.field1488 = FloorUnderlayDefinition.getWidget(var1); // L: 8807
												Client.field602 = var0; // L: 8808
												break label653;
											}

											if (var2 != 1007) {
												if (var2 == 1011 || var2 == 1010 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
													class344.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8981
												}
												break label653;
											}
										}

										var17 = class293.getWidgetChild(var1, var0); // L: 8716
										if (var17 != null) { // L: 8717
											ArchiveLoader.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 8718
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9374
			Client.isItemSelected = 0; // L: 9375
			class220.invalidateWidget(FloorUnderlayDefinition.getWidget(GraphicsObject.selectedItemWidget)); // L: 9376
		}

		if (Client.isSpellSelected) { // L: 9378
			class362.Widget_runOnTargetLeave();
		}

		if (class121.field1488 != null && Client.field601 == 0) { // L: 9379
			class220.invalidateWidget(class121.field1488);
		}

	} // L: 9380

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-408298670"
	)
	static void method82() {
		if (Client.oculusOrbState == 1) { // L: 12392
			Client.field701 = true; // L: 12393
		}

	} // L: 12395
}
