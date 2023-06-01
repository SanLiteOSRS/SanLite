import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("ay")
	@Export("name")
	String name;
	@ObfuscatedName("an")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lsg;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 16
		this.cleanName = class259.method5389(var1, var2); // L: 17
	} // L: 18

	public Username(String var1) {
		this.name = var1; // L: 11
		this.cleanName = class259.method5389(var1, LoginType.oldscape); // L: 12
	} // L: 13

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1269317379"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2059281205"
	)
	public String method9600() {
		return this.cleanName; // L: 25
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1127785997"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 29
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)I",
		garbageValue = "-408534382"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 56
			return var1.cleanName == null ? 0 : 1; // L: 57 58
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 60 61
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 34
			Username var2 = (Username)var1; // L: 35
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 36
			} else if (var2.cleanName == null) { // L: 37
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 38 39
			}
		} else {
			return false; // L: 41
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 46 47
	}

	public String toString() {
		return this.getName(); // L: 52
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 65
	}
}
