import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("ModeWhere")
public enum ModeWhere implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4381("", 0, new class368[]{class368.field4351, class368.field4350}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4383("", 1, new class368[]{class368.field4348, class368.field4351, class368.field4350}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4366("", 2, new class368[]{class368.field4348, class368.field4349, class368.field4351}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4368("", 3, new class368[]{class368.field4348}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4370("", 4),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4367("", 5, new class368[]{class368.field4348, class368.field4351}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4379("", 6, new class368[]{class368.field4351}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4373("", 8, new class368[]{class368.field4348, class368.field4351}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4374("", 9, new class368[]{class368.field4348, class368.field4349}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4375("", 10, new class368[]{class368.field4348}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4376("", 11, new class368[]{class368.field4348}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4377("", 12, new class368[]{class368.field4348, class368.field4351}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4378("", 13, new class368[]{class368.field4348});

	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1128587901
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -356156909
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ap")
	final Set field4380;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lom;)V"
	)
	ModeWhere(String var3, int var4, class368[] var5) {
		this.field4380 = new HashSet();
		this.id = var4; // L: 37
		class368[] var6 = var5; // L: 39

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 40
			class368 var8 = var6[var7]; // L: 41
			this.field4380.add(var8); // L: 42
		}

	} // L: 45

	ModeWhere(String var3, int var4) {
		this.field4380 = new HashSet(); // L: 30
		this.id = var4; // L: 33
	} // L: 34

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 49
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-119"
	)
	static final void method6945(int var0, int var1, boolean var2) {
		if (!var2 || var0 != VertexNormal.field2776 || class488.field4967 != var1) { // L: 5840
			VertexNormal.field2776 = var0; // L: 5843
			class488.field4967 = var1; // L: 5844
			class47.method867(25); // L: 5845
			AbstractWorldMapIcon.drawLoadingMessage("Loading - please wait.", true); // L: 5846
			int var3 = class147.baseX * 64; // L: 5847
			int var4 = baseY * 64; // L: 5848
			class147.baseX = (var0 - 6) * 8; // L: 5849
			baseY = (var1 - 6) * 8; // L: 5850
			int var5 = class147.baseX * 64 - var3; // L: 5851
			int var6 = baseY * 64 - var4; // L: 5852
			var3 = class147.baseX * 64; // L: 5853
			var4 = baseY * 64; // L: 5854

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5855
				NPC var19 = Client.npcs[var7]; // L: 5856
				if (var19 != null) { // L: 5857
					for (var9 = 0; var9 < 10; ++var9) { // L: 5858
						var10000 = var19.pathX; // L: 5859
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5860
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5862
					var19.y -= var6 * 128; // L: 5863
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5866
				Player var22 = Client.players[var7]; // L: 5867
				if (var22 != null) { // L: 5868
					for (var9 = 0; var9 < 10; ++var9) { // L: 5869
						var10000 = var22.pathX; // L: 5870
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5871
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5873
					var22.y -= var6 * 128; // L: 5874
				}
			}

			byte var20 = 0; // L: 5877
			byte var8 = 104; // L: 5878
			byte var21 = 1; // L: 5879
			if (var5 < 0) { // L: 5880
				var20 = 103; // L: 5881
				var8 = -1; // L: 5882
				var21 = -1; // L: 5883
			}

			byte var10 = 0; // L: 5885
			byte var11 = 104; // L: 5886
			byte var12 = 1; // L: 5887
			if (var6 < 0) { // L: 5888
				var10 = 103; // L: 5889
				var11 = -1; // L: 5890
				var12 = -1; // L: 5891
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5893
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5894
					int var15 = var5 + var13; // L: 5895
					int var16 = var6 + var14; // L: 5896

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5897
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5898
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5899
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5903 5904 5908
				var18.x -= var5; // L: 5905
				var18.y -= var6; // L: 5906
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5907
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5910
				Client.destinationX -= var5; // L: 5911
				Client.destinationY -= var6; // L: 5912
			}

			Client.soundEffectCount = 0; // L: 5914
			Client.isCameraLocked = false; // L: 5915
			class19.cameraX -= var5 << 7; // L: 5916
			BuddyRankComparator.cameraZ -= var6 << 7; // L: 5917
			WorldMapSection0.oculusOrbFocalPointX -= var5 << 7; // L: 5918
			TextureProvider.oculusOrbFocalPointY -= var6 << 7; // L: 5919
			Client.field609 = -1; // L: 5920
			Client.graphicsObjects.clear(); // L: 5921
			Client.projectiles.clear(); // L: 5922

			for (var14 = 0; var14 < 4; ++var14) { // L: 5923
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5841 5924

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "726014649"
	)
	static final void method6947(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12444
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3316()) { // L: 12445
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12446
				PacketBufferNode var4 = class251.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 12447
				var4.packetBuffer.writeByte(4 + class298.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12448
				var4.packetBuffer.writeByte(var0); // L: 12449
				var4.packetBuffer.writeShort(var1); // L: 12450
				var4.packetBuffer.writeBoolean(var2); // L: 12451
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12452
				Client.packetWriter.addNode(var4); // L: 12453
			}
		}
	} // L: 12454
}
