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

@ObfuscatedName("qy")
public class class439 {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field4743;
	@ObfuscatedName("at")
	final Map field4742;
	@ObfuscatedName("an")
	final Map field4741;
	@ObfuscatedName("ao")
	final DecimalFormat field4744;

	public class439() {
		this.field4742 = new HashMap(); // L: 12
		this.field4741 = new HashMap(); // L: 13
		this.field4744 = new DecimalFormat(); // L: 14
		this.field4744.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "1542041279"
	)
	public void method7937(HttpsURLConnection var1) {
		Iterator var2 = this.field4742.entrySet().iterator(); // L: 21

		while (var2.hasNext()) { // L: 26
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "1"
	)
	public Map method7939() {
		return this.field4742; // L: 30
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-49"
	)
	public void method7957(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4742.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	public void method7940(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4742.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Ljava/lang/String;I)V",
		garbageValue = "-371767513"
	)
	void method7941(class438 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7933(), var2); // L: 46
		this.method7957("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-15"
	)
	public void method7942(String var1) {
		this.method7941(class438.field4735, var1); // L: 51
	} // L: 52

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1950319585"
	)
	public void method7961(String var1) {
		this.method7941(class438.field4736, var1); // L: 55
	} // L: 56

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)V",
		garbageValue = "-100061078"
	)
	public void method7945(class480 var1) {
		this.field4742.put("Content-Type", var1.method8532()); // L: 59
	} // L: 60

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1012118567"
	)
	public void method7978() {
		this.field4742.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)V",
		garbageValue = "315819894"
	)
	public void method7946(class480 var1) {
		this.method7947(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsv;FI)V",
		garbageValue = "1680282612"
	)
	void method7947(class480 var1, float var2) {
		this.field4741.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method7948(); // L: 72
	} // L: 73

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	void method7948() {
		this.field4742.remove("Accept"); // L: 76
		if (!this.field4741.isEmpty()) { // L: 77
			this.field4742.put("Accept", this.method7973()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1125389390"
	)
	String method7973() {
		ArrayList var1 = new ArrayList(this.field4741.entrySet()); // L: 83
		Collections.sort(var1, new class440(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class480)var4.getKey()).method8532()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4744.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}
}
