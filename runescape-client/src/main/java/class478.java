import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class478 implements class477 {
	@ObfuscatedName("at")
	Map field4921;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	final class508 field4919;

	@ObfuscatedSignature(
		descriptor = "(Ltn;)V"
	)
	public class478(class508 var1) {
		this.field4919 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-117"
	)
	public int vmethod8643(int var1) {
		if (this.field4921 != null) { // L: 20
			class509 var2 = (class509)this.field4921.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5083; // L: 22
			}
		}

		return (Integer)this.field4919.vmethod9238(var1); // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-291731808"
	)
	public void vmethod8642(int var1, Object var2) {
		if (this.field4921 == null) { // L: 29
			this.field4921 = new HashMap(); // L: 30
			this.field4921.put(var1, new class509(var1, var2)); // L: 31
		} else {
			class509 var3 = (class509)this.field4921.get(var1); // L: 34
			if (var3 == null) {
				this.field4921.put(var1, new class509(var1, var2)); // L: 35
			} else {
				var3.field5083 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4921 == null ? Collections.emptyList().iterator() : this.field4921.values().iterator(); // L: 42 43
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;Ljava/lang/String;Ljava/lang/String;I)Lph;",
		garbageValue = "-1413034825"
	)
	public static Font method8649(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) { // L: 183
			return null;
		} else {
			int var4 = var0.getGroupId(var2); // L: 184
			int var5 = var0.getFileId(var4, var3); // L: 185
			byte[] var8 = var0.takeFile(var4, var5); // L: 190
			boolean var7;
			if (var8 == null) { // L: 191
				var7 = false; // L: 192
			} else {
				UserComparator2.SpriteBuffer_decode(var8); // L: 195
				var7 = true; // L: 196
			}

			Font var6;
			if (!var7) { // L: 198
				var6 = null; // L: 199
			} else {
				byte[] var9 = var1.takeFile(var4, var5); // L: 203
				Font var11;
				if (var9 == null) { // L: 205
					var11 = null; // L: 206
				} else {
					Font var10 = new Font(var9, class515.SpriteBuffer_xOffsets, class402.SpriteBuffer_yOffsets, class515.SpriteBuffer_spriteWidths, class515.SpriteBuffer_spriteHeights, class515.SpriteBuffer_spritePalette, class515.SpriteBuffer_pixels); // L: 209
					TextureProvider.method4758(); // L: 210
					var11 = var10; // L: 211
				}

				var6 = var11; // L: 213
			}

			return var6; // L: 215
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1570128715"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1785
		Login.Login_response2 = var1; // L: 1786
		Login.Login_response3 = var2; // L: 1787
	} // L: 1788
}
