import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public class class490 implements class489 {
	@ObfuscatedName("au")
	static int[] field4980;
	@ObfuscatedName("ai")
	Map field4981;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	final class520 field4982;

	@ObfuscatedSignature(
		descriptor = "(Luf;)V"
	)
	public class490(class520 var1) {
		this.field4982 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-18640"
	)
	public int vmethod8762(int var1) {
		if (this.field4981 != null) { // L: 20
			class521 var2 = (class521)this.field4981.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5129; // L: 22
			}
		}

		return (Integer)this.field4982.vmethod9385(var1); // L: 24
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1818647968"
	)
	public void vmethod8763(int var1, Object var2) {
		if (this.field4981 == null) { // L: 29
			this.field4981 = new HashMap(); // L: 30
			this.field4981.put(var1, new class521(var1, var2)); // L: 31
		} else {
			class521 var3 = (class521)this.field4981.get(var1); // L: 34
			if (var3 == null) {
				this.field4981.put(var1, new class521(var1, var2)); // L: 35
			} else {
				var3.field5129 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4981 == null ? Collections.emptyList().iterator() : this.field4981.values().iterator(); // L: 42 43
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "52"
	)
	static String method8767(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12709
		if (Client.gameBuild == 1) { // L: 12710
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12711
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12712
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12713
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12714
			var0 = "local";
		}

		String var3 = ""; // L: 12715
		if (class138.field1604 != null) { // L: 12716
			var3 = "/p=" + class138.field1604;
		}

		String var4 = "runescape.com"; // L: 12717
		return var2 + var0 + "." + var4 + "/l=" + WorldMapElement.clientLanguage + "/a=" + class449.field4730 + var3 + "/"; // L: 12718
	}
}
