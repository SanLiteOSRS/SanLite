import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lan;"
	)
	public static final WorldMapCacheName field333;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lan;"
	)
	public static final WorldMapCacheName field323;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lan;"
	)
	public static final WorldMapCacheName field324;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lan;"
	)
	static final WorldMapCacheName field325;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lan;"
	)
	public static final WorldMapCacheName field326;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("h")
	@Export("name")
	public final String name;

	static {
		field333 = new WorldMapCacheName("details");
		field323 = new WorldMapCacheName("compositemap");
		field324 = new WorldMapCacheName("compositetexture");
		field325 = new WorldMapCacheName("area");
		field326 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1996576804"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!FontName.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = FontName.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (DefaultsGroup.Widget_interfaceComponents[var0] == null) {
					DefaultsGroup.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (DefaultsGroup.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = FontName.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							DefaultsGroup.Widget_interfaceComponents[var0][var2] = new Widget();
							DefaultsGroup.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								DefaultsGroup.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								DefaultsGroup.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "-11688"
	)
	static void method715() {
		if (Client.oculusOrbState == 1) {
			Client.field747 = true;
		}

	}
}
