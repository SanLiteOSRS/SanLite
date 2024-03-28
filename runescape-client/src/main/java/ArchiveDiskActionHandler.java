import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1592027713
	)
	static int field4360;
	@ObfuscatedName("at")
	static boolean field4358;
	@ObfuscatedName("an")
	static Object field4365;
	@ObfuscatedName("ao")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4360 = 0; // L: 11
		field4358 = false; // L: 12
		field4365 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 70
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 71
				} // L: 72

				if (var1 != null) { // L: 73
					if (var1.type == 0) { // L: 74
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 75
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 76
							var1.remove(); // L: 77
						} // L: 78
					} else if (var1.type == 1) { // L: 80
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 81
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 82
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 83
						} // L: 84
					}

					synchronized(field4365) { // L: 86
						if ((field4358 || field4360 <= 1) && ArchiveDiskActionHandler_requestQueue.method7256()) { // L: 87
							field4360 = 0; // L: 88
							field4365.notifyAll(); // L: 89
							return; // L: 90
						}

						field4360 = 600; // L: 92
					}
				} else {
					class499.method8677(100L); // L: 96
					synchronized(field4365) { // L: 97
						if ((field4358 || field4360 <= 1) && ArchiveDiskActionHandler_requestQueue.method7256()) { // L: 98
							field4360 = 0; // L: 99
							field4365.notifyAll(); // L: 100
							return; // L: 101
						}

						--field4360; // L: 103
					}
				}
			}
		} catch (Exception var13) { // L: 108
			class180.RunException_sendStackTrace((String)null, var13); // L: 109
		}
	} // L: 111

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "2"
	)
	static final boolean method6905(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 166
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 167
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 168
			if (var7 > var0 && var7 > var1 && var7 > var2) { // L: 169
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 170
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 171
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 172
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 173
				}
			}
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)V",
		garbageValue = "-19196"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12860
		short[] var2 = new short[16]; // L: 12861
		int var3 = 0; // L: 12862

		for (int var4 = 0; var4 < ItemComposition.ItemComposition_fileCount; ++var4) { // L: 12863
			ItemComposition var9 = class10.ItemComposition_get(var4); // L: 12864
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12865 12866 12867
				if (var3 >= 250) { // L: 12868
					ReflectionCheck.foundItemIdCount = -1; // L: 12869
					class59.foundItemIds = null; // L: 12870
					return; // L: 12871
				}

				if (var3 >= var2.length) { // L: 12873
					short[] var6 = new short[var2.length * 2]; // L: 12874

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12875
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12876
				}

				var2[var3++] = (short)var4; // L: 12878
			}
		}

		class59.foundItemIds = var2; // L: 12880
		class333.foundItemIndex = 0; // L: 12881
		ReflectionCheck.foundItemIdCount = var3; // L: 12882
		String[] var8 = new String[ReflectionCheck.foundItemIdCount]; // L: 12883

		for (int var5 = 0; var5 < ReflectionCheck.foundItemIdCount; ++var5) { // L: 12884
			var8[var5] = class10.ItemComposition_get(var2[var5]).name;
		}

		class467.method8371(var8, class59.foundItemIds); // L: 12885
	} // L: 12886
}
