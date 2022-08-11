import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("n")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 322967523
	)
	@Export("z")
	int z;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1269824327
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1035238041
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1532847157
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1295637093
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1643518363
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 373875107
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -272668053194713397L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1415469043
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-59"
	)
	static boolean method4513(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I[BLng;I)V",
		garbageValue = "-2077766974"
	)
	static void method4515(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field3991 == 0) { // L: 28
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field3991 = 600; // L: 34
		}
	} // L: 37

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "832150942"
	)
	public static void method4514(int var0) {
		if (var0 != -1) { // L: 261
			if (GameObject.Widget_loadedInterfaces[var0]) { // L: 262
				class228.Widget_archive.clearFilesGroup(var0); // L: 263
				if (Widget.Widget_interfaceComponents[var0] != null) { // L: 264
					boolean var1 = true; // L: 265

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) { // L: 266
						if (Widget.Widget_interfaceComponents[var0][var2] != null) { // L: 267
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) { // L: 268
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 269
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null; // L: 272
					}

					GameObject.Widget_loadedInterfaces[var0] = false; // L: 273
				}
			}
		}
	} // L: 274

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1761002702"
	)
	static final void method4516(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 11792
		var0 = 100 - var0; // L: 11793
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 11794
		Rasterizer3D.Rasterizer3D_setBrightness((double)var1); // L: 11796
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness((double)var1); // L: 11797
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 11799
		class260.clientPreferences.method2322((double)var1); // L: 11801
	} // L: 11803
}
