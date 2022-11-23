import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class362 implements Iterator {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static IndexedSprite field4314;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	class363 field4317;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2094821203
	)
	int field4312;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1109029639
	)
	int field4313;

	@ObfuscatedSignature(
		descriptor = "(Lmd;)V"
	)
	class362(class363 var1) {
		this.field4312 = 0; // L: 177
		this.field4313 = this.field4317.field4324; // L: 178
		this.field4317 = var1; // L: 181
	} // L: 182

	public Object next() {
		if (this.field4317.field4324 != this.field4313) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4312 < this.field4317.field4322) { // L: 193
			Object var1 = this.field4317.field4325[this.field4312].field4310; // L: 194
			++this.field4312; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public boolean hasNext() {
		return this.field4312 < this.field4317.field4322; // L: 186
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160860137"
	)
	static void method6840() {
		Login.Login_username = Login.Login_username.trim(); // L: 1112
		if (Login.Login_username.length() == 0) { // L: 1113
			MusicPatchNode2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1114
		} else {
			long var1;
			try {
				URL var3 = new URL(class135.method2990("services", false) + "m=accountappeal/login.ws"); // L: 1121
				URLConnection var4 = var3.openConnection(); // L: 1122
				var4.setRequestProperty("connection", "close"); // L: 1123
				var4.setDoInput(true); // L: 1124
				var4.setDoOutput(true); // L: 1125
				var4.setConnectTimeout(5000); // L: 1126
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1127
				var5.write("data1=req"); // L: 1128
				var5.flush(); // L: 1129
				InputStream var6 = var4.getInputStream(); // L: 1130
				Buffer var7 = new Buffer(new byte[1000]); // L: 1131

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1133
					if (var8 == -1) { // L: 1134
						var7.offset = 0; // L: 1141
						long var10 = var7.readLong(); // L: 1142
						var1 = var10; // L: 1143
						break;
					}

					var7.offset += var8; // L: 1135
					if (var7.offset >= 1000) { // L: 1136
						var1 = 0L; // L: 1137
						break;
					}
				}
			} catch (Exception var14) { // L: 1145
				var1 = 0L; // L: 1146
			}

			int var0;
			if (var1 == 0L) { // L: 1150
				var0 = 5;
			} else {
				var0 = class357.method6825(var1, Login.Login_username); // L: 1151
			}

			switch(var0) { // L: 1152
			case 2:
				MusicPatchNode2.setLoginResponseString(Strings.field3924, Strings.field4045, Strings.field4057); // L: 1163
				GrandExchangeOfferOwnWorldComparator.method1171(6); // L: 1164
				break; // L: 1165
			case 3:
				MusicPatchNode2.setLoginResponseString("", "Error connecting to server.", ""); // L: 1154
				break; // L: 1155
			case 4:
				MusicPatchNode2.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1160
				break; // L: 1161
			case 5:
				MusicPatchNode2.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1170
				break;
			case 6:
				MusicPatchNode2.setLoginResponseString("", "Error connecting to server.", ""); // L: 1157
				break; // L: 1158
			case 7:
				MusicPatchNode2.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1167
			}

		}
	} // L: 1115 1173
}
