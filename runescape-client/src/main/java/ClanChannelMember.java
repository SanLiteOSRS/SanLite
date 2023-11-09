import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("p")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("aa")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("a")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1833678213
	)
	@Export("world")
	public int world;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27643045"
	)
	static final void method3000() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 8602
		var0.importIndex(); // L: 8603
		int var1 = var0.readBits(8); // L: 8604
		int var2;
		if (var1 < Client.npcCount) { // L: 8605
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8606
				Client.field627[++Client.field626 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8608
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8609

			for (var2 = 0; var2 < var1; ++var2) { // L: 8610
				int var3 = Client.npcIndices[var2]; // L: 8611
				NPC var4 = Client.npcs[var3]; // L: 8612
				int var5 = var0.readBits(1); // L: 8613
				if (var5 == 0) { // L: 8614
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8615
					var4.npcCycle = Client.cycle; // L: 8616
				} else {
					int var6 = var0.readBits(2); // L: 8619
					if (var6 == 0) { // L: 8620
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8621
						var4.npcCycle = Client.cycle; // L: 8622
						Client.field551[++Client.field550 - 1] = var3; // L: 8623
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8626
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8627
							var4.npcCycle = Client.cycle; // L: 8628
							var7 = var0.readBits(3); // L: 8629
							var4.method2487(var7, class202.field2282); // L: 8630
							var8 = var0.readBits(1); // L: 8631
							if (var8 == 1) { // L: 8632
								Client.field551[++Client.field550 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8635
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8636
							var4.npcCycle = Client.cycle; // L: 8637
							if (var0.readBits(1) == 1) { // L: 8638
								var7 = var0.readBits(3); // L: 8639
								var4.method2487(var7, class202.field2284); // L: 8640
								var8 = var0.readBits(3); // L: 8641
								var4.method2487(var8, class202.field2284); // L: 8642
							} else {
								var7 = var0.readBits(3); // L: 8645
								var4.method2487(var7, class202.field2281); // L: 8646
							}

							var7 = var0.readBits(1); // L: 8648
							if (var7 == 1) { // L: 8649
								Client.field551[++Client.field550 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 8652
							Client.field627[++Client.field626 - 1] = var3; // L: 8653
						}
					}
				}
			}

		}
	} // L: 8657
}
