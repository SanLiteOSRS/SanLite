import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("ModeWhere")
public enum ModeWhere implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4393("", 0, new class370[]{class370.field4372, class370.field4370}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4389("", 1, new class370[]{class370.field4369, class370.field4372, class370.field4370}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4390("", 2, new class370[]{class370.field4369, class370.field4373, class370.field4372}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4406("", 3, new class370[]{class370.field4369}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4392("", 4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4394("", 5, new class370[]{class370.field4369, class370.field4372}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4395("", 6, new class370[]{class370.field4372}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4399("", 8, new class370[]{class370.field4369, class370.field4372}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4397("", 9, new class370[]{class370.field4369, class370.field4373}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4398("", 10, new class370[]{class370.field4369}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4391("", 11, new class370[]{class370.field4369}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4400("", 12, new class370[]{class370.field4369, class370.field4372}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4401("", 13, new class370[]{class370.field4369});

	@ObfuscatedName("dc")
	static boolean field4404;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 380292501
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -539297047
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ar")
	final Set field4403;

	static {
		method6962(); // L: 26
	} // L: 27

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Log;)V"
	)
	ModeWhere(String var3, int var4, class370[] var5) {
		this.field4403 = new HashSet();
		this.id = var4; // L: 41
		class370[] var6 = var5; // L: 43

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 44
			class370 var8 = var6[var7]; // L: 45
			this.field4403.add(var8); // L: 46
		}

	} // L: 49

	ModeWhere(String var3, int var4) {
		this.field4403 = new HashSet(); // L: 30
		this.id = var4; // L: 37
	} // L: 38

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 53
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Loe;",
		garbageValue = "-1302821718"
	)
	static ModeWhere[] method6962() {
		return new ModeWhere[]{field4391, field4401, field4392, field4397, field4399, field4406, field4398, field4400, field4394, field4389, field4395, field4390, field4393}; // L: 33
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1598349673"
	)
	public static void method6955(AbstractArchive var0) {
		class13.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class316.Widget_loadedInterfaces[var0]) { // L: 242
			return true;
		} else if (!Decimator.Widget_archive.tryLoadGroup(var0)) { // L: 243
			return false;
		} else {
			int var1 = Decimator.Widget_archive.getGroupFileCount(var0); // L: 244
			if (var1 == 0) { // L: 245
				class316.Widget_loadedInterfaces[var0] = true; // L: 246
				return true; // L: 247
			} else {
				if (PacketBufferNode.Widget_interfaceComponents[var0] == null) { // L: 249
					PacketBufferNode.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 250
					if (PacketBufferNode.Widget_interfaceComponents[var0][var2] == null) { // L: 251
						byte[] var3 = Decimator.Widget_archive.takeFile(var0, var2); // L: 252
						if (var3 != null) { // L: 253
							PacketBufferNode.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 254
							PacketBufferNode.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 255
							if (var3[0] == -1) { // L: 256
								PacketBufferNode.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								PacketBufferNode.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 257
							}
						}
					}
				}

				class316.Widget_loadedInterfaces[var0] = true; // L: 261
				return true; // L: 262
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Ldh;",
		garbageValue = "-305798584"
	)
	static Script method6961(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 69
		if (var2 != null) { // L: 70
			return var2; // L: 71
		} else {
			String var3 = String.valueOf(var0); // L: 73
			int var4 = GrandExchangeOffer.archive12.getGroupId(var3); // L: 74
			if (var4 == -1) { // L: 75
				return null; // L: 76
			} else {
				byte[] var5 = GrandExchangeOffer.archive12.takeFileFlat(var4); // L: 78
				if (var5 != null) { // L: 79
					if (var5.length <= 1) { // L: 80
						return null; // L: 81
					}

					var2 = HitSplatDefinition.newScript(var5); // L: 83
					if (var2 != null) { // L: 84
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 85
						return var2; // L: 86
					}
				}

				return null; // L: 89
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "516890386"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1872
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1873
			boolean var1 = var0.isMembersOnly(); // L: 1874
			if (var1 != ItemComposition.ItemComposition_inMembersWorld) { // L: 1876
				ItemComposition.ItemComposition_cached.clear(); // L: 1878
				ItemComposition.ItemComposition_cachedModels.clear(); // L: 1879
				ItemComposition.ItemComposition_cachedSprites.clear(); // L: 1880
				ItemComposition.ItemComposition_inMembersWorld = var1; // L: 1882
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1886
			Archive var3 = PcmPlayer.field304; // L: 1887
			int var2 = var0.properties; // L: 1888
			if ((var2 & class510.field5090.rsOrdinal()) != 0) { // L: 1890
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 1891
			} else if ((var2 & class510.field5091.rsOrdinal()) != 0) { // L: 1893
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 1894
			} else if ((var2 & class510.field5069.rsOrdinal()) != 0) { // L: 1896
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", ""); // L: 1897
			} else {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 1900
			}
		}

		class292.worldHost = var0.host; // L: 1904
		Client.worldId = var0.id; // L: 1905
		Client.worldProperties = var0.properties; // L: 1906
		class30.field166 = var0.field847; // L: 1907
		class480.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1908
		class129.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1909
		class4.currentPort = class480.worldPort; // L: 1910
	} // L: 1911
}
