import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("cd")
	public static char field3780;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -581156997
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -8319452105604280943L
	)
	long field3770;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -4202680176653939475L
	)
	long field3771;
	@ObfuscatedName("v")
	public boolean field3772;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -6108273028306314795L
	)
	long field3777;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -3021156974356860875L
	)
	long field3774;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -4665176274502754377L
	)
	long field3775;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -460386751
	)
	int field3773;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1685103385
	)
	int field3778;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1772065697
	)
	int field3776;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1176466241
	)
	int field3779;

	public Timer() {
		this.field3770 = -1L;
		this.field3771 = -1L;
		this.field3772 = false;
		this.field3777 = 0L;
		this.field3774 = 0L;
		this.field3775 = 0L;
		this.field3773 = 0;
		this.field3778 = 0;
		this.field3776 = 0;
		this.field3779 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1876708169"
	)
	public void method5690() {
		this.field3770 = ClientPacket.currentTimeMillis();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-962261688"
	)
	public void method5672() {
		if (-1L != this.field3770) {
			this.field3774 = ClientPacket.currentTimeMillis() - this.field3770;
			this.field3770 = -1L;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	public void method5675(int var1) {
		this.field3771 = ClientPacket.currentTimeMillis();
		this.field3773 = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-95839674"
	)
	public void method5676() {
		if (this.field3771 != -1L) {
			this.field3777 = ClientPacket.currentTimeMillis() - this.field3771;
			this.field3771 = -1L;
		}

		++this.field3776;
		this.field3772 = true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method5677() {
		this.field3772 = false;
		this.field3778 = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1992092142"
	)
	public void method5678() {
		this.method5676();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "646714111"
	)
	@Export("write")
	public void write(Buffer var1) {
		ClanChannel.method56(var1, this.field3774);
		ClanChannel.method56(var1, this.field3777);
		ClanChannel.method56(var1, this.field3775);
		var1.writeShort(this.field3773);
		var1.writeShort(this.field3778);
		var1.writeShort(this.field3776);
		var1.writeShort(this.field3779);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loc;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}
}
