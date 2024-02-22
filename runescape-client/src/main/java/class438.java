import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class438 {
	@ObfuscatedName("ai")
	final Map field4707;
	@ObfuscatedName("ar")
	final Map field4705;
	@ObfuscatedName("as")
	final DecimalFormat field4706;

	public class438() {
		this.field4707 = new HashMap(); // L: 12
		this.field4705 = new HashMap(); // L: 13
		this.field4706 = new DecimalFormat(); // L: 14
		this.field4706.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "832288405"
	)
	public void method8135(HttpsURLConnection var1) {
		Iterator var2 = this.field4707.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-1425874347"
	)
	public Map method8157() {
		return this.field4707; // L: 30
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "51"
	)
	public void method8137(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4707.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-113"
	)
	public void method8138(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4707.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Ljava/lang/String;I)V",
		garbageValue = "-662923695"
	)
	void method8139(class437 var1, String var2) {
		String var3 = String.format("%s %s", var1.method8130(), var2); // L: 46
		this.method8137("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1161058155"
	)
	public void method8140(String var1) {
		this.method8139(class437.field4699, var1); // L: 51
	} // L: 52

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-69"
	)
	public void method8141(String var1) {
		this.method8139(class437.field4698, var1); // L: 55
	} // L: 56

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsp;S)V",
		garbageValue = "28545"
	)
	public void method8142(class479 var1) {
		this.field4707.put("Content-Type", var1.method8751()); // L: 59
	} // L: 60

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	public void method8149() {
		this.field4707.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V",
		garbageValue = "-1672836519"
	)
	public void method8144(class479 var1) {
		this.method8148(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsp;FB)V",
		garbageValue = "124"
	)
	void method8148(class479 var1, float var2) {
		this.field4705.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method8178(); // L: 72
	} // L: 73

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "615407127"
	)
	void method8178() {
		this.field4707.remove("Accept"); // L: 76
		if (!this.field4705.isEmpty()) { // L: 77
			this.field4707.put("Accept", this.method8147()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	String method8147() {
		ArrayList var1 = new ArrayList(this.field4705.entrySet()); // L: 83
		Collections.sort(var1, new class439(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class479)var4.getKey()).method8751()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4706.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}
}
