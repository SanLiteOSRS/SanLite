import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class15 extends class14 {
	@ObfuscatedName("gu")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("f")
	String field128;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class15(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field128 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.field81 = this.field128;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1672620512"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class69.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!FloorDecoration.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = FloorDecoration.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class69.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) {
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = FloorDecoration.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							Widget.Widget_interfaceComponents[var0][var2] = new Widget();
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class69.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Lni;",
		garbageValue = "1945002537"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class20.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class20.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(Canvas.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}
}
