import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class7 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1342537435
	)
	static int field21;
	@ObfuscatedName("aq")
	ExecutorService field18;
	@ObfuscatedName("aw")
	Future field13;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	final Buffer field15;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class3 field16;

	@ObfuscatedSignature(
		descriptor = "(Luq;Lai;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field18 = Executors.newSingleThreadExecutor(); // L: 10
		this.field15 = var1; // L: 16
		this.field16 = var2; // L: 17
		this.method43(); // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "385185200"
	)
	public boolean method40() {
		return this.field13.isDone(); // L: 22
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	public void method41() {
		this.field18.shutdown(); // L: 26
		this.field18 = null; // L: 27
	} // L: 28

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Luq;",
		garbageValue = "-1961365501"
	)
	public Buffer method42() {
		try {
			return (Buffer)this.field13.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "764307874"
	)
	void method43() {
		this.field13 = this.field18.submit(new class1(this, this.field15, this.field16)); // L: 40
	} // L: 41

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "393503738"
	)
	static void method39(int var0, int var1) {
		if (class30.clientPreferences.method2544() != 0 && var0 != -1) { // L: 3851
			ArrayList var2 = new ArrayList(); // L: 3852
			var2.add(new class333(WorldMapSectionType.field2612, var0, 0, class30.clientPreferences.method2544(), false)); // L: 3853
			PacketWriter.method2891(var2, 0, 0, 0, 0, true); // L: 3854
			Client.playingJingle = true; // L: 3855
		}

	} // L: 3857

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1011099662"
	)
	static final void method53(int var0, int var1, int var2) {
		if (FriendsChatMember.cameraX < var0) { // L: 3955
			FriendsChatMember.cameraX = (var0 - FriendsChatMember.cameraX) * GameBuild.field3978 / 1000 + FriendsChatMember.cameraX + class516.field5118; // L: 3956
			if (FriendsChatMember.cameraX > var0) { // L: 3957
				FriendsChatMember.cameraX = var0;
			}
		}

		if (FriendsChatMember.cameraX > var0) { // L: 3959
			FriendsChatMember.cameraX -= (FriendsChatMember.cameraX - var0) * GameBuild.field3978 / 1000 + class516.field5118; // L: 3960
			if (FriendsChatMember.cameraX < var0) { // L: 3961
				FriendsChatMember.cameraX = var0;
			}
		}

		if (class18.cameraY < var1) { // L: 3963
			class18.cameraY = (var1 - class18.cameraY) * GameBuild.field3978 / 1000 + class18.cameraY + class516.field5118; // L: 3964
			if (class18.cameraY > var1) { // L: 3965
				class18.cameraY = var1;
			}
		}

		if (class18.cameraY > var1) { // L: 3967
			class18.cameraY -= (class18.cameraY - var1) * GameBuild.field3978 / 1000 + class516.field5118; // L: 3968
			if (class18.cameraY < var1) { // L: 3969
				class18.cameraY = var1;
			}
		}

		if (class317.cameraZ < var2) { // L: 3971
			class317.cameraZ = (var2 - class317.cameraZ) * GameBuild.field3978 / 1000 + class317.cameraZ + class516.field5118; // L: 3972
			if (class317.cameraZ > var2) { // L: 3973
				class317.cameraZ = var2;
			}
		}

		if (class317.cameraZ > var2) { // L: 3975
			class317.cameraZ -= (class317.cameraZ - var2) * GameBuild.field3978 / 1000 + class516.field5118; // L: 3976
			if (class317.cameraZ < var2) { // L: 3977
				class317.cameraZ = var2;
			}
		}

	} // L: 3979
}
