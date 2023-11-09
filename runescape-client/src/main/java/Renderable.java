import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 417479049
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("di")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lls;Ljava/lang/String;Ljava/lang/String;IZB)V",
		garbageValue = "-108"
	)
	public static void method4229(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1); // L: 34
		int var6 = var0.getFileId(var5, var2); // L: 35
		class118.method2713(var0, var5, var6, var3, var4); // L: 36
	} // L: 37

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "1510342619"
	)
	static boolean method4227(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 209
			int var3 = var2.read(); // L: 210
			var2.seek(0L); // L: 211
			var2.write(var3); // L: 212
			var2.seek(0L); // L: 213
			var2.close(); // L: 214
			if (var1) { // L: 215
				var0.delete();
			}

			return true; // L: 216
		} catch (Exception var4) { // L: 218
			return false; // L: 219
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1654436589"
	)
	static int method4228(String var0) {
		if (var0.equals("centre")) { // L: 297
			return 1; // L: 298
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 300 301 303
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "([Lkn;II)V",
		garbageValue = "-313022235"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11314
			Widget var3 = var0[var2]; // L: 11315
			if (var3 != null) { // L: 11316
				if (var3.type == 0) { // L: 11317
					if (var3.children != null) { // L: 11318
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11319
					if (var4 != null) { // L: 11320
						ModelData0.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11322
					var5 = new ScriptEvent(); // L: 11323
					var5.widget = var3; // L: 11324
					var5.args = var3.onDialogAbort; // L: 11325
					SceneTilePaint.runScriptEvent(var5); // L: 11326
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11328
					if (var3.childIndex >= 0) { // L: 11329
						Widget var6 = HitSplatDefinition.getWidget(var3.id); // L: 11330
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11331
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11335
					var5.widget = var3; // L: 11336
					var5.args = var3.onSubChange; // L: 11337
					SceneTilePaint.runScriptEvent(var5); // L: 11338
				}
			}
		}

	} // L: 11341
}
