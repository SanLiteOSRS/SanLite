import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class22 {
	@ObfuscatedName("w")
	static byte[][][] field122;

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-680563104"
	)
	static final void method245(boolean var0) {
		if (var0) {
			Client.field710 = Login.field1223 ? class169.field2046 : class169.field2044;
		} else {
			LinkedHashMap var1 = Tile.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field710 = var1.containsKey(var5) ? class169.field2045 : class169.field2043;
		}

	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-916071017"
	)
	static final int method244() {
		if (Tile.clientPreferences.roofsHidden) {
			return Huffman.Client_plane;
		} else {
			int var0 = ArchiveLoader.getTileHeight(VertexNormal.cameraX, AbstractWorldMapData.cameraZ, Huffman.Client_plane);
			return var0 - FaceNormal.cameraY < 800 && (Tiles.Tiles_renderFlags[Huffman.Client_plane][VertexNormal.cameraX >> 7][AbstractWorldMapData.cameraZ >> 7] & 4) != 0 ? Huffman.Client_plane : 3;
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "31538"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = SecureRandomCallable.getWidgetChild(class232.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				Script.runScriptEvent(var1);
			}

			Client.isSpellSelected = false;
			class52.invalidateWidget(var0);
		}
	}
}
