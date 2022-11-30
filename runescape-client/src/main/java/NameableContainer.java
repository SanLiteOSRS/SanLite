import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1695015859
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -486443911
	)
	@Export("size")
	int size;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("s")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("p")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("b")
	@Export("comparator")
	Comparator comparator;

	NameableContainer(int var1) {
		this.size = 0;
		this.comparator = null; // L: 14
		this.capacity = var1; // L: 17
		this.array = this.newTypedArray(var1); // L: 18
		this.usernamesMap = new HashMap(var1 / 8); // L: 19
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 20
	} // L: 21

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Loj;",
		garbageValue = "31"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)[Loj;",
		garbageValue = "-41299588"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1953629195"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "936617473"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1838216958"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity; // L: 35
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)Z",
		garbageValue = "-1635365855"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrg;B)Loj;",
		garbageValue = "12"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrg;B)Loj;",
		garbageValue = "-16"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)Loj;",
		garbageValue = "2070159512"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrg;B)Z",
		garbageValue = "-61"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 61
		if (var2 == null) { // L: 62
			return false;
		} else {
			this.remove(var2); // L: 63
			return true; // L: 64
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-691454376"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)Loj;",
		garbageValue = "-2054707737"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lrg;I)Loj;",
		garbageValue = "-645107578"
	)
	@Export("addLast")
	Nameable addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) { // L: 79
			throw new IllegalStateException();
		} else {
			Nameable var3 = this.newInstance(); // L: 80
			var3.set(var1, var2); // L: 81
			this.arrayAddLast(var3); // L: 82
			this.mapPut(var3); // L: 83
			return var3; // L: 84
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Loj;",
		garbageValue = "221714526"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1037280537"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Loj;Lrg;Lrg;I)V",
		garbageValue = "165259804"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)I",
		garbageValue = "-1422965268"
	)
	@Export("indexOf")
	final int indexOf(Nameable var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 108
			if (this.array[var2] == var1) { // L: 109
				return var2;
			}
		}

		return -1; // L: 111
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-641917828"
	)
	@Export("mapRemove")
	final void mapRemove(Nameable var1) {
		if (this.usernamesMap.remove(var1.username) == null) { // L: 115
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername); // L: 116
			}

		}
	} // L: 117

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-792727175"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Loj;B)V",
		garbageValue = "-43"
	)
	@Export("mapPut")
	final void mapPut(Nameable var1) {
		this.usernamesMap.put(var1.username, var1); // L: 124
		if (var1.previousUsername != null) { // L: 125
			Nameable var2 = (Nameable)this.previousUsernamesMap.put(var1.previousUsername, var1); // L: 126
			if (var2 != null && var2 != var1) { // L: 127
				var2.previousUsername = null; // L: 128
			}
		}

	} // L: 131

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2142344104"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1295085332"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;ZII)V",
		garbageValue = "-2066181658"
	)
	static void method7441(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 162
			if (var3 == 4) { // L: 163
				GrandExchangeOfferOwnWorldComparator.method1171(4); // L: 164
			}

		} else {
			if (var3 == 0) { // L: 168
				GrandExchangeEvents.method6463(var2); // L: 169
			} else {
				GrandExchangeOfferOwnWorldComparator.method1171(var3); // L: 172
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 174
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 175
			class313.leftTitleSprite = class26.method394(var4); // L: 176
			HealthBar.rightTitleSprite = class313.leftTitleSprite.mirrorHorizontally(); // L: 177
			int var5 = Client.worldProperties; // L: 178
			if ((var5 & 536870912) != 0) { // L: 180
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 181
			} else if ((var5 & 1073741824) != 0) { // L: 183
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 184
			} else if ((var5 & 256) != 0) { // L: 186
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 187
			} else {
				MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 190
			}

			class356.titleboxSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 193
			class143.field1647 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 194
			class362.field4314 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 195
			class138.field1609 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 196
			AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 197
			class239.field2845 = class410.method7741(var1, "runes", ""); // L: 198
			class16.title_muteSprite = class410.method7741(var1, "title_mute", ""); // L: 199
			Login.field908 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 200
			MouseRecorder.field1059 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 201
			class181.field1931 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 202
			class341.field4230 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 203
			ModeWhere.field4271 = Login.field908.subWidth; // L: 204
			Login.field915 = Login.field908.subHeight * -507610800; // L: 205
			GraphicsObject.loginScreenRunesAnimation = new LoginScreenAnimation(class239.field2845); // L: 206
			if (var2) { // L: 207
				Login.Login_username = ""; // L: 208
				Login.Login_password = ""; // L: 209
				Login.field914 = new String[8]; // L: 210
				Login.field913 = 0; // L: 211
			}

			class360.field4308 = 0; // L: 213
			class355.otp = ""; // L: 214
			Login.field900 = true; // L: 215
			Login.worldSelectOpen = false; // L: 216
			if (!BufferedSink.clientPreferences.method2383()) { // L: 217
				FloorUnderlayDefinition.method3623(2, ReflectionCheck.archive6, "scape main", "", 255, false);
			} else {
				class283.musicPlayerStatus = 1; // L: 219
				DevicePcmPlayerProvider.musicTrackArchive = null; // L: 220
				class283.musicTrackGroupId = -1; // L: 221
				class283.musicTrackFileId = -1; // L: 222
				Messages.musicTrackVolume = 0; // L: 223
				GrandExchangeEvents.musicTrackBoolean = false; // L: 224
				class19.pcmSampleLength = 2; // L: 225
			}

			MouseHandler.method697(false); // L: 227
			Login.clearLoginScreen = true; // L: 228
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 229
			Login.loginBoxX = Login.xPadding + 202; // L: 230
			Canvas.loginBoxCenter = Login.loginBoxX + 180; // L: 231
			class313.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 232
			HealthBar.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 233
			MouseRecorder.logoSprite.drawAt(Login.xPadding + 382 - MouseRecorder.logoSprite.subWidth / 2, 18); // L: 234
		}
	} // L: 166 235

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "-2135224371"
	)
	public static void method7442(String[] var0, short[] var1) {
		VarpDefinition.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10
}
