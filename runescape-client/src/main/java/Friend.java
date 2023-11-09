import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("s")
	boolean field4294;
	@ObfuscatedName("h")
	boolean field4293;

	Friend() {
	} // L: 9

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)I",
		garbageValue = "-1549435031"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4294 && !var1.field4294) { // L: 16
			return -1;
		} else if (!this.field4294 && var1.field4294) { // L: 17
			return 1;
		} else if (this.field4293 && !var1.field4293) { // L: 18
			return -1;
		} else if (!this.field4293 && var1.field4293) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "1550816169"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "-16"
	)
	static Date method6595() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1106
		var0.setLenient(false); // L: 1107
		StringBuilder var1 = new StringBuilder(); // L: 1108
		String[] var2 = Login.field892; // L: 1110

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1111
			String var4 = var2[var3]; // L: 1112
			if (var4 == null) { // L: 1114
				class116.method2683(7); // L: 1116
				ItemComposition.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1117
				return null; // L: 1119
			}

			var1.append(var4); // L: 1121
		}

		var1.append("12"); // L: 1125
		return var0.parse(var1.toString()); // L: 1126
	}
}
