import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public final class class4 {
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "847756638"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3867
			class11.method108(0, 0); // L: 3868
		} else if (var0 != -1) { // L: 3870
			boolean var1;
			if (class321.field3496.isEmpty()) { // L: 3873
				var1 = false; // L: 3878
			} else {
				class333 var2 = (class333)class321.field3496.get(0); // L: 3874
				var1 = var2 != null && var0 == var2.field3605; // L: 3875
			}

			if (!var1 && NPC.clientPreferences.method2503() != 0) { // L: 3880 3881
				ArrayList var3 = new ArrayList(); // L: 3882
				var3.add(new class333(UserComparator6.field1508, var0, 0, NPC.clientPreferences.method2503(), false)); // L: 3883
				if (Client.playingJingle) { // L: 3884
					HealthBar.method2572(var3, 0, 100, 100, 0); // L: 3885
				} else {
					Renderable.method4881(var3, 0, 100, 100, 0, false); // L: 3888
				}
			}
		}

	} // L: 3893

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1508155305"
	)
	static boolean method18() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5233
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(ZLun;I)V",
		garbageValue = "1109808750"
	)
	static final void method19(boolean var0, PacketBuffer var1) {
		while (true) {
			byte var2 = 16; // L: 8873
			int var3 = 1 << var2; // L: 8874
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) { // L: 8875
				int var4 = var1.readBits(var2); // L: 8876
				if (var4 != var3 - 1) { // L: 8877
					boolean var5 = false; // L: 8878
					if (Client.npcs[var4] == null) { // L: 8879
						Client.npcs[var4] = new NPC(); // L: 8880
						var5 = true; // L: 8881
					}

					NPC var6 = Client.npcs[var4]; // L: 8883
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8884
					var6.npcCycle = Client.cycle; // L: 8885
					int var9;
					if (var0) { // L: 8889
						var9 = var1.readBits(8); // L: 8890
						if (var9 > 127) { // L: 8891
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 8894
						if (var9 > 15) { // L: 8895
							var9 -= 32;
						}
					}

					int var10 = var1.readBits(1); // L: 8897
					if (var10 == 1) { // L: 8898
						Client.field742[++Client.field571 - 1] = var4;
					}

					int var7 = var1.readBits(1); // L: 8899
					int var11 = Client.field647[var1.readBits(3)]; // L: 8900
					if (var5) { // L: 8901
						var6.orientation = var6.rotation = var11;
					}

					var6.definition = UserComparator10.getNpcDefinition(var1.readBits(14)); // L: 8902
					int var8;
					if (var0) { // L: 8903
						var8 = var1.readBits(8); // L: 8904
						if (var8 > 127) { // L: 8905
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 8908
						if (var8 > 15) { // L: 8909
							var8 -= 32;
						}
					}

					boolean var12 = var1.readBits(1) == 1; // L: 8911
					if (var12) { // L: 8912
						var1.readBits(32); // L: 8913
					}

					SoundCache.method843(var6); // L: 8915
					if (var6.field1268 == 0) { // L: 8916
						var6.rotation = 0;
					}

					var6.method2633(class133.localPlayer.pathX[0] + var8, class133.localPlayer.pathY[0] + var9, var7 == 1); // L: 8917
					continue; // L: 8918
				}
			}

			var1.exportIndex(); // L: 8919
			return; // L: 8920
		}
	}
}
