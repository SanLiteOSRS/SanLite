import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class7 {
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("aw")
	ExecutorService field31;
	@ObfuscatedName("ay")
	Future field29;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	final Buffer field27;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class3 field28;

	@ObfuscatedSignature(
		descriptor = "(Lty;Lam;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field31 = Executors.newSingleThreadExecutor(); // L: 10
		this.field27 = var1;
		this.field28 = var2;
		this.method52();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1852017365"
	)
	public boolean method54() {
		return this.field29.isDone();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	public void method47() {
		this.field31.shutdown();
		this.field31 = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lty;",
		garbageValue = "1875881919"
	)
	public Buffer method48() {
		try {
			return (Buffer)this.field29.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1250861800"
	)
	void method52() {
		this.field29 = this.field31.submit(new class1(this, this.field27, this.field28));
	} // L: 41

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-8386743"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-89265387"
	)
	public static void method60(int var0) {
		if (!class306.field3394.isEmpty()) { // L: 81
			Iterator var1 = class306.field3394.iterator(); // L: 82

			while (var1.hasNext()) {
				class318 var2 = (class318)var1.next(); // L: 83
				if (var2 != null) { // L: 85
					var2.field3510 = var0; // L: 88
				}
			}

			class318 var3 = (class318)class306.field3394.get(0); // L: 91
			if (var3 != null && var3.field3516 != null && var3.field3516.isReady() && !var3.field3515) { // L: 92
				var3.field3516.setPcmStreamVolume(var0); // L: 93
				var3.field3511 = (float)var0; // L: 94
			}
		}

	} // L: 97

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lig;IIII)V",
		garbageValue = "-1636583906"
	)
	static void method51(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class150.clientPreferences.method2481() != 0) { // L: 3823
			if (var0.field2267 != null && var0.field2267.containsKey(var1)) { // L: 3824
				SoundSystem.method853((Integer)var0.field2267.get(var1), var2, var3); // L: 3825
			}
		}
	} // L: 3826

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-670080014"
	)
	static final void method45(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10237
			if (Client.menuOptionsCount < 500) { // L: 10238
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10239
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10240
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10241
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10242
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10243
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10244
				Client.field666[Client.menuOptionsCount] = var6; // L: 10245
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10246
				++Client.menuOptionsCount; // L: 10247
			}

		}
	} // L: 10249

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-59"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (Login.loadInterface(var0)) { // L: 10622
			WorldMapDecoration.field3003 = null; // L: 10629
			class47.drawInterface(ArchiveLoader.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10630
			if (WorldMapDecoration.field3003 != null) { // L: 10631
				class47.drawInterface(WorldMapDecoration.field3003, -1412584499, var1, var2, var3, var4, class300.field3351, WorldMapIcon_0.field2956, var7); // L: 10632
				WorldMapDecoration.field3003 = null; // L: 10633
			}

		} else {
			if (var7 != -1) { // L: 10623
				Client.field718[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10625
					Client.field718[var8] = true;
				}
			}

		}
	} // L: 10627 10635
}
