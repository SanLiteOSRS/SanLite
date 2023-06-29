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

@ObfuscatedName("pj")
public class class407 {
	@ObfuscatedName("as")
	final Map field4541;
	@ObfuscatedName("ax")
	final Map field4540;
	@ObfuscatedName("ap")
	final DecimalFormat field4539;

	public class407() {
		this.field4541 = new HashMap(); // L: 12
		this.field4540 = new HashMap(); // L: 13
		this.field4539 = new DecimalFormat(); // L: 14
		this.field4539.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "-2039102239"
	)
	public void method7640(HttpsURLConnection var1) {
		Iterator var2 = this.field4541.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "2005775152"
	)
	public Map method7641() {
		return this.field4541; // L: 30
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "755189204"
	)
	public void method7642(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4541.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1921423246"
	)
	public void method7643(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4541.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Ljava/lang/String;B)V",
		garbageValue = "-48"
	)
	void method7644(class406 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7635(), var2); // L: 46
		this.method7642("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1629749961"
	)
	public void method7678(String var1) {
		this.method7644(class406.field4536, var1); // L: 51
	} // L: 52

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-35"
	)
	public void method7646(String var1) {
		this.method7644(class406.field4535, var1); // L: 55
	} // L: 56

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "-1402490176"
	)
	public void method7647(class448 var1) {
		this.field4541.put("Content-Type", var1.method8223()); // L: 59
	} // L: 60

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	public void method7645() {
		this.field4541.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "-1014036136"
	)
	public void method7649(class448 var1) {
		this.method7667(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lro;FB)V",
		garbageValue = "49"
	)
	void method7667(class448 var1, float var2) {
		this.field4540.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method7651(); // L: 72
	} // L: 73

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	void method7651() {
		this.field4541.remove("Accept"); // L: 76
		if (!this.field4540.isEmpty()) { // L: 77
			this.field4541.put("Accept", this.method7666()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-877459928"
	)
	String method7666() {
		ArrayList var1 = new ArrayList(this.field4540.entrySet()); // L: 83
		Collections.sort(var1, new class408(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class448)var4.getKey()).method8223()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4539.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}
}
