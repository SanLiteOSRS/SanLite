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

@ObfuscatedName("pu")
public class class390 {
	@ObfuscatedName("ab")
	final Map field4465;
	@ObfuscatedName("an")
	final Map field4468;
	@ObfuscatedName("ao")
	final DecimalFormat field4469;

	public class390() {
		this.field4465 = new HashMap(); // L: 12
		this.field4468 = new HashMap(); // L: 13
		this.field4469 = new DecimalFormat(); // L: 14
		this.field4469.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "-1545289120"
	)
	public void method7355(HttpsURLConnection var1) {
		Iterator var2 = this.field4465.entrySet().iterator(); // L: 21

		while (var2.hasNext()) { // L: 26
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "1"
	)
	public Map method7356() {
		return this.field4465; // L: 30
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-625731660"
	)
	public void method7359(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4465.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1613794431"
	)
	public void method7358(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4465.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Loy;Ljava/lang/String;B)V",
		garbageValue = "-64"
	)
	void method7393(class389 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7351(), var2); // L: 46
		this.method7359("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-512273013"
	)
	public void method7360(String var1) {
		this.method7393(class389.field4463, var1); // L: 51
	} // L: 52

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1064028789"
	)
	public void method7357(String var1) {
		this.method7393(class389.field4461, var1); // L: 55
	} // L: 56

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqn;B)V",
		garbageValue = "4"
	)
	public void method7362(class431 var1) {
		this.field4465.put("Content-Type", var1.method7965()); // L: 59
	} // L: 60

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	public void method7363() {
		this.field4465.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "1731496941"
	)
	public void method7364(class431 var1) {
		this.method7367(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqn;FB)V",
		garbageValue = "36"
	)
	void method7367(class431 var1, float var2) {
		this.field4468.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method7366(); // L: 72
	} // L: 73

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	void method7366() {
		this.field4465.remove("Accept"); // L: 76
		if (!this.field4468.isEmpty()) { // L: 77
			this.field4465.put("Accept", this.method7361()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-88"
	)
	String method7361() {
		ArrayList var1 = new ArrayList(this.field4468.entrySet()); // L: 83
		Collections.sort(var1, new class391(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class431)var4.getKey()).method7965()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4469.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}
}
