import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("v")
	@Export("name")
	String name;
	@ObfuscatedName("c")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpe;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		this.cleanName = class196.method3900(var1, var2);
	}

	public Username(String var1) {
		this.name = var1;
		this.cleanName = class196.method3900(var1, LoginType.oldscape);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1852169176"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method8243() {
		return this.cleanName;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "125"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqb;I)I",
		garbageValue = "1960668931"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}
}
