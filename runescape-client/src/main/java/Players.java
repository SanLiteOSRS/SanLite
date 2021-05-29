import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Players")
public class Players {
	@ObfuscatedName("f")
	static byte[] field1370;
	@ObfuscatedName("y")
	static byte[] field1373;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lnd;"
	)
	static Buffer[] field1374;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1143549299
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("r")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1936837699
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("d")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("s")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("u")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("l")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1149592963
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("c")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static Buffer field1384;

	static {
		field1370 = new byte[2048];
		field1373 = new byte[2048];
		field1374 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1384 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1331673664"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class44.field318.startsWith("win")) {
				class249.method4792(var0, 0);
			} else if (class44.field318.startsWith("mac")) {
				Script.method1996(var0, 1, "openjs");
			} else {
				class249.method4792(var0, 2);
			}
		} else {
			class249.method4792(var0, 3);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2094559510"
	)
	static final int method2311() {
		return ViewportMouse.ViewportMouse_y;
	}
}
