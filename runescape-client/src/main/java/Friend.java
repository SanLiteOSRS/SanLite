import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("hi")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("c")
	boolean field4133;
	@ObfuscatedName("l")
	boolean field4134;

	Friend() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;I)I",
		garbageValue = "1669986775"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4133 && !var1.field4133) {
			return -1;
		} else if (!this.field4133 && var1.field4133) {
			return 1;
		} else if (this.field4134 && !var1.field4134) {
			return -1;
		} else if (!this.field4134 && var1.field4134) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)I",
		garbageValue = "-1446218206"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnz;",
		garbageValue = "-2100256585"
	)
	static class374[] method6284() {
		return new class374[]{class374.field4263, class374.field4267, class374.field4264, class374.field4262};
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "883217738"
	)
	static final void method6297(boolean var0) {
		if (var0) {
			Client.field533 = Login.field893 ? class122.field1498 : class122.field1496;
		} else {
			LinkedHashMap var1 = class424.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field533 = var1.containsKey(var5) ? class122.field1494 : class122.field1495;
		}

	}
}
