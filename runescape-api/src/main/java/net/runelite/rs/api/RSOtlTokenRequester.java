package net.runelite.rs.api;

import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import net.runelite.mapping.Import;

import java.net.URL;
import java.util.concurrent.Future;

public interface RSOtlTokenRequester extends OtlTokenRequester
{
	@Import("request")
	Future<OtlTokenResponse> request(URL url);
}
