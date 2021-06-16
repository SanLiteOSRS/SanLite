import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class7 extends class16 {
	@ObfuscatedName("gz")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("f")
	String field52;
	@ObfuscatedName("e")
	byte field55;
	@ObfuscatedName("v")
	byte field53;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class7(class19 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		this.field52 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field52 != null) {
			var1.readUnsignedByte();
			this.field55 = var1.readByte();
			this.field53 = var1.readByte();
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		var1.name = this.field52;
		if (this.field52 != null) {
			var1.field27 = this.field55;
			var1.field28 = this.field53;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "653378140"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = class262.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - class15.baseX * 64;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - WorldMapSprite.baseY * 64;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		SoundSystem.Client_plane = var2.plane = var4;
		if (Players.field1362[var1] != null) {
			var2.read(Players.field1362[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1372[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1372[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "609615234"
	)
	static int method88(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return MouseHandler.method718(var0, var1, var2);
		} else if (var0 < 1100) {
			return Client.method1745(var0, var1, var2);
		} else if (var0 < 1200) {
			return InvDefinition.method2699(var0, var1, var2);
		} else if (var0 < 1300) {
			return BufferedSink.method5990(var0, var1, var2);
		} else if (var0 < 1400) {
			return ObjectSound.method1889(var0, var1, var2);
		} else if (var0 < 1500) {
			return Renderable.method4250(var0, var1, var2);
		} else if (var0 < 1600) {
			return TaskHandler.method2626(var0, var1, var2);
		} else if (var0 < 1700) {
			return ClanChannelMember.method106(var0, var1, var2);
		} else if (var0 < 1800) {
			return Decimator.method1162(var0, var1, var2);
		} else if (var0 < 1900) {
			return WorldMapRegion.method3472(var0, var1, var2);
		} else if (var0 < 2000) {
			return WorldMapLabel.method3715(var0, var1, var2);
		} else if (var0 < 2100) {
			return Client.method1745(var0, var1, var2);
		} else if (var0 < 2200) {
			return InvDefinition.method2699(var0, var1, var2);
		} else if (var0 < 2300) {
			return BufferedSink.method5990(var0, var1, var2);
		} else if (var0 < 2400) {
			return ObjectSound.method1889(var0, var1, var2);
		} else if (var0 < 2500) {
			return Renderable.method4250(var0, var1, var2);
		} else if (var0 < 2600) {
			return NetCache.method5178(var0, var1, var2);
		} else if (var0 < 2700) {
			return Player.method2235(var0, var1, var2);
		} else if (var0 < 2800) {
			return MouseHandler.method747(var0, var1, var2);
		} else if (var0 < 2900) {
			return StructComposition.method2972(var0, var1, var2);
		} else if (var0 < 3000) {
			return WorldMapLabel.method3715(var0, var1, var2);
		} else if (var0 < 3200) {
			return class82.method2031(var0, var1, var2);
		} else if (var0 < 3300) {
			return StudioGame.method4983(var0, var1, var2);
		} else if (var0 < 3400) {
			return class267.method4991(var0, var1, var2);
		} else if (var0 < 3500) {
			return class18.method262(var0, var1, var2);
		} else if (var0 < 3600) {
			return MilliClock.method2685(var0, var1, var2);
		} else if (var0 < 3700) {
			return LoginScreenAnimation.method2314(var0, var1, var2);
		} else if (var0 < 3800) {
			return WorldMapData_0.method3267(var0, var1, var2);
		} else if (var0 < 3900) {
			return class32.method386(var0, var1, var2);
		} else if (var0 < 4000) {
			return class281.method5204(var0, var1, var2);
		} else if (var0 < 4100) {
			return NPCComposition.method2857(var0, var1, var2);
		} else if (var0 < 4200) {
			return SoundCache.method929(var0, var1, var2);
		} else if (var0 < 4300) {
			return class375.method6531(var0, var1, var2);
		} else if (var0 < 5100) {
			return class25.method336(var0, var1, var2);
		} else if (var0 < 5400) {
			return WorldMapSectionType.method3668(var0, var1, var2);
		} else if (var0 < 5600) {
			return LoginScreenAnimation.method2285(var0, var1, var2);
		} else if (var0 < 5700) {
			return UserComparator6.method2585(var0, var1, var2);
		} else if (var0 < 6300) {
			return class19.method276(var0, var1, var2);
		} else if (var0 < 6600) {
			return class8.method102(var0, var1, var2);
		} else if (var0 < 6700) {
			return ModeWhere.method5283(var0, var1, var2);
		} else if (var0 < 6800) {
			return class43.method527(var0, var1, var2);
		} else if (var0 < 6900) {
			return class5.method72(var0, var1, var2);
		} else if (var0 < 7000) {
			return UserComparator4.method2529(var0, var1, var2);
		} else if (var0 < 7100) {
			return class269.method4996(var0, var1, var2);
		} else if (var0 < 7200) {
			return WorldMapScaleHandler.method3857(var0, var1, var2);
		} else {
			return var0 < 7300 ? PcmPlayer.method898(var0, var1, var2) : 2;
		}
	}
}
